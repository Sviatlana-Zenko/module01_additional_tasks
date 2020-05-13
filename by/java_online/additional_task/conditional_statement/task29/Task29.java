/*
 * Вычислить значение функции:
 * -x^2 + x - 9, x >= 8
 * 1/(x^4 - 6), x < 8
 */

package by.java_online.additional_task.conditional_statement.task29;

import java.util.Scanner;

public class Task29 {
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

        if (x >= 8){
            functionValue = (Math.pow(x, 2)) * (-1) + x - 9;
        } else {
            functionValue = 1 / (Math.pow(x, 4) - 6);
        }

        System.out.println("Function value = " + functionValue);
    }
}
