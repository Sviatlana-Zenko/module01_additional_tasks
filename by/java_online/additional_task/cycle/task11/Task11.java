/*
 * Даны числовой ряд ([x; y]) и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше
 * или равен заданному е. Общий член ряда имеет вид:
 * a(n) = 1/((3*n-2)*(3*n+1))
 */

package by.java_online.additional_task.cycle.task11;

public class Task11 {
    public static void main(String[] args) {
        int x;
        int y;
        double e;
        double sum;

        x = 1;
        y = 5;
        e = 0.02;
        sum = 0;

        while (x <= y) {
            double a;
            a = 1.0 / ((3 * x - 2) * (3 * x + 1));

            if ((Math.abs(a)) >= e){
                sum += Math.abs(a);
            }
            x++;
        }

        System.out.println("Sum = " + sum);
    }
}
