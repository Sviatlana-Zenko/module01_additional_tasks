/*
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
 * Преобразовать его в другое число, цифры которого будут следовать в обратном
 * порядке по сравнению с введенным числом.
 */

package by.java_online.additional_task.cycle.task13;

public class Task13 {
    public static void main(String[] args) {
        int number;
        int counter;
        int sum;
        int newNumber;

        number = 2148700;

        counter = findNumberOfDigits(number);
        sum = findSumOfEvenDigits(number, counter);
        newNumber = swapDigits(number, counter);

        System.out.println("We have number " + number +
                            "\nSum of even digits is " + sum);

        if (findNumberOfDigits(newNumber) < counter) {
            String format = "New number is %0" + counter + "d";
            System.out.printf(format, newNumber);
        } else {
            System.out.println("New number is " + newNumber);
        }
    }

    public static int findNumberOfDigits(int number) {
        int counter = 1;

        while (number / 10 > 0) {
            counter += 1;
            number /= 10;
        }

        return counter;
    }

    public static int findSumOfEvenDigits(int number, int counter) {
        int sum = 0;

        while (counter > 0) {
            int digit;
            digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
            counter--;
        }

        return sum;
    }

    public static int swapDigits(int number, int counter) {
        int newNumber = 0;

        while (counter > 0) {
            int digit;
            digit = number % 10;

            newNumber = (newNumber * 10) + digit;
            number /= 10;
            counter--;
        }

        return newNumber;
    }
}
