/*
 * С помощью оператора while напишите программу вывода всех
 * нечетных чисел в диапазоне от 1 до 99 включительно.
 */

package by.java_online.additional_task.cycle.task05;

public class Task05 {
    public static void main(String[] args) {
        int number1;
        int number2;

        number1 = 1;
        number2 = 99;

        System.out.println("Odd numbers (from " + number1 + " to " + number2 + ")");

        while (number1 <= number2) {
            if (number1 % 2 != 0) {
                System.out.print(number1 + "; ");
            }
            number1++;
        }
    }
}
