/*
 * Дано значение x. Получить значения -2x + 3x^2 - 4x^3
 * и 1 + 2x + 3x^2 + 4x^3.
 * Позаботьтесь об эконоии операций.
 */

package by.java_online.additional_task.linear_program.task34;

public class Task34 {
    public static void main(String[] args) {
        double x;
        double a;
        double b;
        double expression1;
        double expression2;

        x = 2;

        // Части, присутствующие в обоих выражениях, выделяем в переменные а и b
        a = 3 * Math.pow(x, 2);
        b = 2 * x + 4 * Math.pow(x, 3);

        // Подставляем эти переменные в исходные выражения
        expression1 = a - b;
        expression2 = 1 + a + b;

        System.out.println("The first expression result is " + expression1 + "\n" +
                            "The second expression result is " + expression2);
    }
}
