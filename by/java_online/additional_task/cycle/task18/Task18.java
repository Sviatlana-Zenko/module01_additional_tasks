/*
 * Два двузначных числа (а и b), записанных одно за другим, образуют
 * четырехзначное число, которое делится на их произведение.
 * Найти эти числа.
 */

package by.java_online.additional_task.cycle.task18;

public class Task18 {
    public static void main(String[] args) {
        int a;
        int b;
        int number;
        int bound;

        number = 1000;
        bound = 9999;

        while (number <= bound) {
            a = number / 100;
            b = number % 100;

            if (b >= 10 && number % (a * b) == 0) {
                System.out.println("a = " + a + ", b = " + b + "\n" + number +
                                   " / (" + a + " * " + b + ") = " + (number / (a * b)));
            }
            number++;
        }
    }
}
