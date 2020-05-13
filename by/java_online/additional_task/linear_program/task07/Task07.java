/*
 * Вычислить значение выражения по формуле
 * (a/c)*(b/d)-((a*b-c)/c*d)
 * (все переменные принимают действительные значения)
 */

package by.java_online.additional_task.linear_program.task07;

public class Task07 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double result;

        a = 15.25;
        b = 17.25;
        c = -5.14;
        d = 2.22;

        result = (a / c) * (b / d) - (a * b - c) / (c * d);

        System.out.println(result);
    }
}
