/*
 * Написать программу, которая по заданным трем числам определяет,
 * является ли сумма каких-либо двух из них положительной.
 */

package by.java_online.additional_task.conditional_statement.task24;

public class Task24 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = -28;
        b = 12;
        c = 7;

        if (a + b > 0 | a + c > 0 | b + c > 0) {
            System.out.println("We have numbers than can give positive sum");
        } else {
            System.out.println("We don't have numbers than can give positive sum");
        }
    }
}
