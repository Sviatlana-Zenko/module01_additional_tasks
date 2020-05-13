/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * заданное число N является степенью числа a
 * (показатель степени может находиться в диапазоне от 0 до 4).
 */

package by.java_online.additional_task.linear_program.task31;

public class Version08 {
    public static void main(String[] args) {
        int n;
        int a;
        int power;
        boolean isEqual;

        n = 4;
        a = 2;
        power = 0;
        isEqual = false;

        while (power <= 4) {
            if (Math.pow(a, power) == n) {
                isEqual = true;
                break;
            }
            power++;
        }

        if (isEqual) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
