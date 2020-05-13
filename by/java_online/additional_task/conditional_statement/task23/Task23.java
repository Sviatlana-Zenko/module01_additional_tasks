/*
 * Даны действительные числа a, b, c. Удвоить эти числа, если a > b > c,
 * и заменить их абсолютными значениями, если это не так.
 */

package by.java_online.additional_task.conditional_statement.task23;

public class Task23 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        a = 14.5;
        b = -4.14;
        c = 3.05;

        if (a > b & b > c) {
            System.out.println("a -> a * 2, b -> b * 2, c -> c * 2");
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            System.out.println("Absolute values for variables a, b, c:");
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
