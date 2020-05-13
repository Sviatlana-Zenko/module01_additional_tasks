/*
 * Составить программу сравнения двух чисел 1 и 2.
 * Если 1 меньше 2 - вывести на экран цифру 7,
 * в противном случае - цифру 8.
 */

package by.java_online.additional_task.conditional_statement.task01;

public class Task01 {
    public static void main(String[] args) {
        double number1;
        double number2;

        number1 = 16.41;
        number2 = 9.55;

        if (number1 < number2) {
            System.out.println(7);
        } else if (number1 > number2) {
            System.out.println(8);
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}
