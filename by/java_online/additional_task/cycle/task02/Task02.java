/*
 * Необходимо вывести на экран числа от 5 до 1.
 */

package by.java_online.additional_task.cycle.task02;

public class Task02 {
    public static void main(String[] args) {
        int firstNumber;
        int lastNumber;

        firstNumber = 5;
        lastNumber = 1;

        for (int i = firstNumber; i >= lastNumber; i--) {
            System.out.print(i + "; ");
        }
    }
}
