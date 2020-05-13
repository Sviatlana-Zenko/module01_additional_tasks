/*
 * Найти частное произведений четных и нечетных
 * цифр четырехзначного числа.
 */

package by.java_online.additional_task.linear_program.task30;

public class Task30 {
    public static void main(String[] args) {
        int number;
        int counter;
        int firstProduct; // Произведение четных цифр
        int secondProduct; // Произведение нечетных цифр
        double quotient;

        number = 15478;
        firstProduct = 1;
        secondProduct = 1;
        counter = 4;

        while (counter > 0) {
            int digit;
            digit = number % 10;

            if (digit % 2 == 0) {
                firstProduct *= digit;
            } else {
                secondProduct *= digit;
            }

            number /= 10;
            counter--;
        }

        quotient = firstProduct * 1.0 / secondProduct;

        System.out.println("Quotient = " + quotient);
    }
}
