/*
 * Вычислить корни квадратного уравнения ax^2 + bx + c = 0
 * с заданными коэффициентами a, b и c (предполагается, что
 * a не равно 0 и что дискриминант уравнения неотрицателен).
 */


package by.java_online.additional_task.linear_program.task20;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double discriminant;
        double x1;
        double x2;

        a = enterVariable("Enter a:");
        b = enterVariable("Enter b:");
        c = enterVariable("Enter c:");

        // Переменная 'а' не должна быть равна 0
        if (a == 0) {
            System.out.println("Variable \"a\" сan't be equal to 0.");
            return;
        }

        discriminant = Math.pow(b, 2) - 4 * a * c;

        x1 = 0;
        x2 = 0;

        if (discriminant < 0) {
            System.out.println("The equation has no solution.");
            return;
        } else if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        }

        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    public static double enterVariable(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double variable;

        System.out.println(message);
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        variable = input.nextDouble();

        return variable;
    }
}