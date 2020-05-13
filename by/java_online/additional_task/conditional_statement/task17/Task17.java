/*
 * Определить, делителем каких чисел a, b, c является число k.
 */

package by.java_online.additional_task.conditional_statement.task17;

public class Task17 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int k;
        int counter;

        a = 6;
        b = 8;
        c = 3;
        k = 2;
        counter = 0;

        if (checkNumber(a, k)) {
            System.out.println(k + " is a divisor for " + a);
            counter++;
        }

        if (checkNumber(b, k)) {
            System.out.println(k + " is a divisor for " + b);
            counter++;
        }

        if (checkNumber(c, k)) {
            System.out.println(k + " is a divisor for " + c);
            counter++;
        }

        if (counter == 0) {
            System.out.println(k + " is not a divisor for the following numbers " +
                                "(" + a + ", " + b + ", " + c);
        }
    }

    public static boolean checkNumber(int number, int divider) {
        boolean condition = false;

        if (number % divider == 0) {
            condition = true;
        }

        return condition;
    }
}
