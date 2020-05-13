/*
 * Даны три действительных числа. Возвести в квадрат те из них,
 * значения которых неотрицательны, и в четвертую степень - отрицательные.
 */

package by.java_online.additional_task.conditional_statement.task11;

public class Task11 {
    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;

        number1 = 14.38;
        number2 = -4.44;
        number3 = 2.14;

        System.out.println(number1 + " -> " + calculatePower(number1) + "\n" +
                            number2 + " -> " + calculatePower(number2) + "\n" +
                            number3 + " -> " + calculatePower(number3));
    }

    public static double calculatePower(double number) {
        double power;

        if (number >= 0) {
            power = Math.pow(number, 2);
        } else {
            power = Math.pow(number, 4);
        }

        return power;
    }
}
