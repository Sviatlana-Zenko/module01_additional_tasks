/*
 * Подсчитать количество положительных чисел a, b, c.
 */

package by.java_online.additional_task.conditional_statement.task16;

public class Task16 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        int counter;

        a = -14.2;
        b = 1.1;
        c = -2.15;
        counter = 0;

        if (a > 0) {
            counter++;
        }

        if (b > 0) {
            counter++;
        }

        if (c > 0) {
            counter++;
        }

        System.out.println("Number of positive elements = " + counter);
    }
}
