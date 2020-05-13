/*
 * Необходимо вывести на экран таблицу умножения на 3.
 */

package by.java_online.additional_task.cycle.task03;

public class Task03 {
    public static void main(String[] args) {
        int a;
        int b;
        int digit;

        a = 1;
        b = 10;
        digit = 3;

        while (a <= b) {
            System.out.println(digit + " * " + a + " = " + (digit * a));
            a++;
        }
    }
}
