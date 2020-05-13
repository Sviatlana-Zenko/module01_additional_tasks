/*
 * Найти произведение цифр заданного четырехзначного числа.
 */

package by.java_online.additional_task.linear_program.task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number;
        int counter;
        int product;

        System.out.println("Enter your four-digit number");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        number = input.nextInt();

        // Проверяем, чтобы введенное число точно было четырехзначным
        if ((number / 1000 < 1) | (number / 1000 > 9)) {
            System.out.println("Wrong number.");
            return;
        }

        counter = 4;
        product = 1;

        while (counter > 0) {
            int digit;
            digit = number % 10;

            product *= digit;
            number /= 10;
            counter--;
        }

        System.out.println("Product is " + product);
    }
}
