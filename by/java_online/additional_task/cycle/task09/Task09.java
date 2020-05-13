/*
 * Дано натуральное число n.
 * Вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 */

package by.java_online.additional_task.cycle.task09;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int denominator;
        int n;
        double expression;

        denominator = 2;
        expression = 1;

        System.out.println("Enter variable n");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        n = input.nextInt();

        if (n < 2) {
            System.out.println("Can't calculate the result. " +
                                "Variable 'n' should be greater than 1.");

            return;
        }


        while (denominator <= n) {
            expression += (1.0 / denominator);
            denominator++;
        }

        System.out.println("The expression value is " + expression);
    }
}
