/*
 * Даны два двузначных числа A и B. Из этих чисел составили 2
 * четырехзначных числа: первое число получили путем написания
 * сначала числа A, а затем B. Для получения второго числа
 * сначала записали число В, а затем А. Найти числа А и В
 * если известно, что первое четырехзначное число нацело делится
 * на 99, а второе на 49.
 */

package by.java_online.additional_task.cycle.task17;

public class Task17 {
    public static void main(String[] args) {
        int a;
        int b;
        int number1;
        int number2;
        int bound;
        int divisor1;
        int divisor2;

        a = 0;
        b = 0;
        number1 = 1000;
        bound = 9999;
        divisor1 = 99;
        divisor2 = 49;


        while (number1 <= bound) {
            if (number1 % divisor1 == 0) {
                number2 = (number1 % 100) * 100 + number1 / 100;

                if (number2 % divisor2 == 0) {
                    a = number1 / 100;
                    b = number1 % 100;
                }
            }

            number1++;
        }

        if (a == 0 & b == 0) {
            System.out.println("There are no such numbers.");
        } else {
            System.out.println("A = " + a + ", B = " + b);
        }
    }
}
