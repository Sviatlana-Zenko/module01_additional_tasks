/*
 * Составить программу нахождения модуля выражения
 * a*x*x + b*x + c при заданных значениях a, b, c и x
 */

package by.java_online.additional_task.conditional_statement.task07;

public class Task07 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        double expression;

        a = 8.44;
        b = -2.01;
        c = 1.88;
        x = 0.5;

        expression = Math.abs(a * Math.pow(x, 2) + b * x + c);

        System.out.println("The expression value is " + expression);
    }
}
