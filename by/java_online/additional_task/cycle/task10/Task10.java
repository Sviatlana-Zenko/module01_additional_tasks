/*
 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

package by.java_online.additional_task.cycle.task10;

public class Task10 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int sum;
        long expression;

        n1 = 1;
        n2 = n1 + 1;
        n3 = 10;
        sum = 0;
        expression = 1L;

        while (n2 <= n3) {
            while (n1 <= n2) {
                sum += n1;
                n1++;
            }

            expression *= sum;
            n2++;
        }

        System.out.println("The expression value is " + expression);
    }
}
