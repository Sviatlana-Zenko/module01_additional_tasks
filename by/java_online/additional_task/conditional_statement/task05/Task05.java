/*
 * Составить программу: определения наименьшего из двух чисел a и b
 */

package by.java_online.additional_task.conditional_statement.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double a;
        double b;

        a = enterVariable("Enter a:");
        b = enterVariable("Enter b:");

        if (a < b) {
            System.out.println("The smallest number is 'a' (" + a + ")");
        } else if (b < a) {
            System.out.println("The smallest number is 'b' (" + b + ")");
        } else {
            System.out.println("Numbers are equal");
        }
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
