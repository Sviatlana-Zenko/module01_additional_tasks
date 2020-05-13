/*
 * Необходимо вывести на экран числа от 1 до 5.
 */

package by.java_online.additional_task.cycle.task01;

public class Task01 {
    public static void main(String[] args) {
        int firstNumber;
        int lastNumber;

        firstNumber = 1;
        lastNumber = 5;

        while (firstNumber <= lastNumber) {
            System.out.print(firstNumber + "; ");
            firstNumber++;
        }
    }
}
