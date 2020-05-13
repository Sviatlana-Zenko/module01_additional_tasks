/*
 * Найдите наибольшую цифру данного натурального числа.
 */

package by.java_online.additional_task.cycle.task21;

public class Task21 {
    public static void main(String[] args) {
        int number;
        int max;

        number = 6589221;

        max = number % 10;
        number /= 10;

        while (number - 1 > 0) {
            int digit;
            digit = number % 10;

            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }

        System.out.println("The largest digit is " + max);
    }
}
