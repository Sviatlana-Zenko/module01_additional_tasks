/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * квадрат заданного трехзначного числа равен кубу суммы
 * цифр этого числа.
 *
 */

package by.java_online.additional_task.linear_program.task31;

public class Version05 {
    public static void main(String[] args) {
        int n;
        int counter;
        int sum;
        int secondPower;
        int thirdPower;

        n = 648;
        counter = 3;
        sum = 0;

        secondPower = (int) Math.pow(n, 2);

        while (counter > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
            counter--;
        }

        thirdPower = (int) Math.pow(sum, 3);

        if (secondPower == thirdPower) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
