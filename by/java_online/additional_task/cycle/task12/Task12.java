/*
 * Составить программу для вычисления значений функции F(x)
 * на отрезке [a, b] с шагом h.
 * F(x) = x - sin(x)
 */

package by.java_online.additional_task.cycle.task12;

public class Task12 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double function;

        a = -1.5;
        b = 2.5;
        h = 0.5;

        while (a <= b) {
            function = a - Math.sin(Math.toRadians(a));
            System.out.println("x = " + a + "   F(x) = " + function);
            a += h;
        }
    }
}
