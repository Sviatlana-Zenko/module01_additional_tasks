/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * точка с координатами (x,y) принадлежит части плоскости
 * между прямыми x = m, x = n (m < n).
 *
 */

package by.java_online.additional_task.linear_program.task31;

public class Version04 {
    public static void main(String[] args) {
        double x;
        double m;
        double n;

        x = 25.5;
        m = 25;
        n = 26;

        if (m >= n) {
            System.out.println("\'n\' should be bigger than \'m\'.");
            return;
        }

        System.out.print("The point belongs to a part of the plane - ");
        if (x >= m & x <= n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
