/*
 * Вычислить значение функции:
 * x^2, 0 <= x <= 3
 * 4, x > 3 или x < 0
 */

package by.java_online.additional_task.conditional_statement.task28;

import java.util.Scanner;

public class Task28 {
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

        if (x >= 0 & x <= 3){
            functionValue = Math.pow(x, 2);
        } else {
            functionValue = 4;
        }

        System.out.println("Function value = " + functionValue);
    }
}
