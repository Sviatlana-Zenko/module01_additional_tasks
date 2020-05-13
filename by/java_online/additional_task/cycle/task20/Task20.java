/*
 * Найдите все четырехзначные числа, сумма цифр
 * которых равна 15.
 */

package by.java_online.additional_task.cycle.task20;

public class Task20 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int sum;

        n1 = 1000;
        n2 = 9999;

        System.out.println("There are four-digit numbers in which the sum of " +
                            "digits is equal to 15:");
        
        while (n1 <= n2) {
            sum = calculateSum(n1);

            if (sum == 15) {
                System.out.print(n1 + "; ");
            }
            n1++;
        }
    }

    public static int calculateSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }

        return sum;
    }
}
