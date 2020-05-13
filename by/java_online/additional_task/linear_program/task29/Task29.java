/*
 * Даны натуральные числа M и N. Вывести старшую цифру дробной части
 * и младшую цифру целой части числа M/N.
 */

package by.java_online.additional_task.linear_program.task29;

public class Task29 {
    public static void main(String[] args) {
        int m;
        int n;
        double divisionResult;
        int twoDigitNumber;  // Число, состоящее из двух нужных нам цифр
        int x;  // Старшая цифра дробной части
        int y;  // Младшая цифра целой части

        m = 15420;
        n = 988;

        divisionResult = m * 1.0 / n;
        divisionResult *= 10;

        twoDigitNumber = (int) divisionResult;
        twoDigitNumber = twoDigitNumber % 100;

        x = twoDigitNumber / 10;
        y = twoDigitNumber % 10;

        System.out.println("The last digit of the integer part is " + x + "\n" +
                            "The first digit of the fractional part is " + y);
    }
}
