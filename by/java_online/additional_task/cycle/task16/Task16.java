/*
 * Для заданного натурального числа определить, образуют ли
 * его цифры арифметическую прогрессию. Предполагается, что в числе
 * не менее трех цифр. Например: 1357, 963.
 */

package by.java_online.additional_task.cycle.task16;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int number;
        int counter;

        number = enterNumber();
        counter = findNumberOfDigits(number);

        if (checkNumber(number, counter)) {
            System.out.println("We have number " + number + ". " +
                                "Its digits form an arithmetic progression.");

        } else {
            System.out.println("We have number " + number + ". " +
                    "Its digits don't form an arithmetic progression.");

        }
    }

    public static int enterNumber() {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        boolean isCorrect;
        int number;

        isCorrect = false;
        number = 0;

        while (!isCorrect) {
            System.out.println("Enter your number:");
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Wrong input. Try again.");
            }
            number = input.nextInt();

            if (number / 100 != 0) {
                isCorrect = true;
            } else {
                System.out.println("It should be at least three-digit " +
                                    "number. Try again.");
            }
        }

        return number;
    }

    public static int findNumberOfDigits(int number) {
        int counter = 1;

        while (number / 10 > 0) {
            counter += 1;
            number /= 10;
        }

        return counter;
    }

    public static boolean checkNumber(int number, int counter) {
        boolean isArithmeticProgression = true;
        int digit;
        int d;

        digit = number % 10;
        number /= 10;
        d = digit - (number % 10);
        digit = number % 10;
        number /= 10;

        while (counter - 2 > 0) {
            if (digit - d != number % 10) {
                isArithmeticProgression = false;
                break;
            }

            digit = number % 10;
            number /= 10;
            counter--;
        }

        return isArithmeticProgression;
    }
}
