/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * сумма первых двух цифр четырехзначного числа
 * равна сумме двух его последних цифр.
 */

package by.java_online.additional_task.linear_program.task31;

public class Version02 {
    public static void main(String[] args) {
        int n;
        int counter;
        int sum1;    // Сумма первых двух цифр
        int sum2;    // Сумма последних двух цифр

        n = 9283;
        sum1 = 0;
        sum2 = 0;
        counter = 4;

        while (counter > 0) {
            int digit;
            digit = n % 10;

            if (counter > 2) {
                sum2 += digit;
            } else {
                sum1 += digit;
            }

            n /= 10;
            counter--;
        }

        System.out.print("The sum of first two digits is equal to " +
                         "the sum of last two digits - ");

        if (sum1 == sum2) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
