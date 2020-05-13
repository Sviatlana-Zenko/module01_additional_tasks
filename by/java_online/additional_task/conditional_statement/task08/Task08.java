/*
 * Составить программу нахождения наименьшего из
 * квадратов двух чисел a и b.
 */

package by.java_online.additional_task.conditional_statement.task08;

public class Task08 {
    public static void main(String[] args) {
        double a;
        double b;
        double power1;
        double power2;

        a = -8.44;
        b = -10.01;

        power1 = Math.pow(a, 2);
        power2 = Math.pow(b, 2);

        if (power1 > power2) {
            System.out.println("'a' in the second power is greater");
        } else if (power2 > power1) {
            System.out.println("'b' in the second power is greater");
        } else {
            System.out.println("They are equal");
        }
    }
}
