/*
 * С помощью оператора while напишите программу вывода всех
 * четных чисел в диапазоне от 2 до 100 включительно.
 */

package by.java_online.additional_task.cycle.task04;

public class Task04 {
    public static void main(String[] args) {
        int number1;
        int number2;

        number1 = 2;
        number2 = 100;

        System.out.println("Even numbers (from " + number1 + " to " + number2 + ")");

        while (number1 <= number2) {
            if (number1 % 2 == 0) {
                System.out.print(number1 + "; ");
            }
            number1++;
        }
    }
}


