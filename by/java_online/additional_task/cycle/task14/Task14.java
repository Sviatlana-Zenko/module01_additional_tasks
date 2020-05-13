/*
 * Получить все числа, не превышающие заданного числа N,
 * которые делятся без остатка на все свои цифры.
 */

package by.java_online.additional_task.cycle.task14;

public class Task14 {
    public static void main(String[] args) {
        int number;
        int bound;
        int counter;

        number = 1;
        bound = 45;

        while (number <= bound) {
            counter = findNumberOfDigits(number);

            if (checkNumber(number, counter)) {
                System.out.print(number + "; ");
            }
            number++;
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

    public static boolean checkNumber(int number, int counter) {
        boolean isCorrect = true;
        int temp = number;

        while (counter > 0) {
            int digit;
            digit = temp % 10;

            if (digit != 0 && number % digit != 0) {
               isCorrect = false;
               break;
            }
            temp /= 10;
            counter--;
        }

        return isCorrect;
    }
}
