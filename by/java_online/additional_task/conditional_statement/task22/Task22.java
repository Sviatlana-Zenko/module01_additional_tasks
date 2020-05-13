/*
 * Написать программу нахождения суммы
 * большего и меньшего из трех чисел.
 */

package by.java_online.additional_task.conditional_statement.task22;

public class Task22 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double max;
        double min;
        double sum;

        a = 15.44;
        b = -10.1;
        c = 1.01;

        if (a >= b & a >= c) {
            max = a;

            if (b >= c) {
                min = c;
            } else {
                min = b;
            }

        } else if (b >= a & b >= c) {
            max = b;

            if (a >= c) {
                min = c;
            } else {
                min = a;
            }

        } else {
            max = c;

            if (a >= b) {
                min = b;
            } else {
                min = a;
            }
        }

        sum = max + min;

        System.out.println("Maximum value + minimum value = " + sum);
    }
}
