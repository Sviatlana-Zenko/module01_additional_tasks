/*
 * Составить алгоритм нахождения среднего
 * арифметического двух чисел.
 */

package by.java_online.additional_task.linear_program.task04;

public class Task04 {
    public static void main(String[] args) {
        double x;
        double y;
        double average;

        x = -6.44;
        y = 9.08;

        average = (x + y) / 2;

        System.out.println("The average of two numbers (" + x +
                            " and " + y + ") is " + average);
    }
}
