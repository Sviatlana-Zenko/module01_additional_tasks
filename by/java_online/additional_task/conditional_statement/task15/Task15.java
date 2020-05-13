/*
 * Подсчитать количество отрицательных среди чисел a, b, c.
 */

package by.java_online.additional_task.conditional_statement.task15;

public class Task15 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        int counter;

        a = 14.2;
        b = 1.1;
        c = -2.15;
        counter = 0;

        if (a < 0 & b < 0 & c < 0) {
            counter = 3;
        } else if ((a < 0 & b < 0) | (a < 0 & c < 0) | (b < 0 & c < 0)) {
            counter = 2;
        } else if (a < 0 | b < 0| c < 0) {
            counter = 1;
        }

        System.out.println("Number of negative elements = " + counter);
    }
}
