/*
 * Составить программу сравнения введенного числа 'a' и цифры 3.
 * Вывести на экран слово "yes", если число 'a' меньше 3;
 * если больше, то вывести слово "no".
 */

package by.java_online.additional_task.conditional_statement.task03;

public class Task03 {
    public static void main(String[] args) {
        double a;
        double digit;

        a = 21542.14;
        digit = 3;

        if (a < digit) {
            System.out.println("yes");
        } else if (a > digit) {
            System.out.println("no");
        } else {
            System.out.println("They are equal.");
        }
    }
}
