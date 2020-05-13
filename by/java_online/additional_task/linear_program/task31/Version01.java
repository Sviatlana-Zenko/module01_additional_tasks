/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * целое число N является двухзначным.
 */

package by.java_online.additional_task.linear_program.task31;

import java.util.Scanner;

public class Version01 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int n;
        int counter;

        System.out.println("Enter your number");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        n = input.nextInt();

        counter = 1;
        while (n / 10 > 0) {
            counter += 1;
            n /= 10;
        }

        System.out.print("Entered number is two-digit number - ");
        if (counter == 2) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
