/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * график функции y = ax^2 + bx + c проходит через заданную точку
 * с координатами (m, n).
 */

package by.java_online.additional_task.linear_program.task31;

public class Version09 {
    public static void main(String[] args) {
        double a = 5;
        double b = 5;
        double c = -2;
        double m = 1;
        double n = 8;

        double function;

        function = a * Math.pow(m, 2) + b * m + c;

        // Квадратное уравнение не может быть решено, если а = 0
        if (a == 0) {
            System.out.println("Can't be solved.");
            return;
        }

        if (function == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
