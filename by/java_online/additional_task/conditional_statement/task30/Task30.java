/*
 * Вычислить значение функции:
 * -x^3 + 9, x <= 13
 * -3/(x + 1), x > 13
 */

package by.java_online.additional_task.conditional_statement.task30;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double x;
        double functionValue;

        System.out.println("Enter variable x");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        x = input.nextDouble();

        if (x <= 13){
            functionValue = (Math.pow(x, 3)) * (-1) + 9;
        } else {
            functionValue = (-3) / (x + 1);
        }

        System.out.println("Function value = " + functionValue);
    }
}
