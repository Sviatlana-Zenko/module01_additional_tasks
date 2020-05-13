/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * сумма каких-либо двух цифр заданного трехзначного натурального
 * числа N равна третьей цифре.
 */

package by.java_online.additional_task.linear_program.task31;

public class Version07 {
    public static void main(String[] args) {
        int n;
        int counter;
        int digit1;
        int digit2;
        int digit3;

        n = 642;
        counter = 3;
        digit1 = 0;
        digit2 = 0;
        digit3 = 0;

        while (counter > 0) {
            int digit;
            digit = n % 10;

            if (counter == 3) {
                digit3 = digit;
            } else if (counter == 2) {
                digit2 = digit;
            } else if (counter == 1) {
                digit1 = digit;
            }

            n /= 10;
            counter--;
        }


        if (digit1 + digit2 == digit3 |
                digit2 + digit3 == digit1 |
                    digit1 + digit3 == digit2) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
