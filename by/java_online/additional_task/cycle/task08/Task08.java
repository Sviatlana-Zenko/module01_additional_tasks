/*
 * Составить таблицу значений функции y = 5 - x^2/2
 * на отрезке [-5; 5] с шагом 0.5
 */

package by.java_online.additional_task.cycle.task08;

public class Task08 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double h;
        double y;

        x1 = -5;
        x2 = 5;
        h = 0.5;

        while (x1 <= x2) {
            y = 5 - Math.pow(x1, 2) / 2;
            System.out.println("x = " + x1 + " -> y = " + y);
            x1 += h;
        }
    }
}
