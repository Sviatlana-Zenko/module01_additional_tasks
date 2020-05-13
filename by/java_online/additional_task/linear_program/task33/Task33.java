/*
 * Дано действительное число x. Не пользуясь никакими другими
 * арифметическими операциями, кроме умножения, сложения и вычитания,
 * вычислите за минимальное число операций:
 * 2x^4 - 3x^3 + 4x^2 - 5x + 6
 */

package by.java_online.additional_task.linear_program.task33;

public class Task33 {
    public static void main(String[] args) {
        double x;
        double secondPower;
        double result;

        x = 2;

        secondPower = x * x;

        result = 2 * secondPower * secondPower - 3 * secondPower * x +
                 4 * secondPower  - 5 * x + 6; // 10 операций

        // 2 * x * x * x * x - 3 * x * x * x + 4 * x * x - 5 * x + 6  - 14 операций

        System.out.println("The expression result is " + result);
    }
}
