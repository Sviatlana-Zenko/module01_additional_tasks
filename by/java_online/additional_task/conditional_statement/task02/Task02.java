/*
 * Составить программу сравнения двух чисел 1 и 2.
 * Если 1 меньше 2 - вывести на экран слово "yes",
 * в противном случае - слово "no".
 */

package by.java_online.additional_task.conditional_statement.task02;

public class Task02 {
    public static void main(String[] args) {
        double number1;
        double number2;

        number1 = 16.41;
        number2 = 9.55;

        if (number1 < number2) {
            System.out.println("yes");
        } else if (number1 > number2) {
            System.out.println("no");
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}
