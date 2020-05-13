/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * сумма цифр данного трехзачного числа N
 * является четным числом.
 */

package by.java_online.additional_task.linear_program.task31;

public class Version03 {
    public static void main(String[] args) {
        int n;
        int counter;
        int sum;

        n = 123;
        counter = 3;
        sum = 0;

        while (counter > 0) {
            int digit;
            digit = n % 10;

            sum += digit;
            n /= 10;
            counter--;
        }

        System.out.print("The sum of digits is even - ");
        if (sum % 2 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
