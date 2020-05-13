/*
 * Даны 2 числа. Найти среднее арифметическое кубов этих чисел
 * и среднее геометрическое модулей этих чисел.
 */

package by.java_online.additional_task.linear_program.task14;

public class Task14 {
    public static void main(String[] args) {
        double number1;
        double number2;
        double geometricMean;
        double arithmeticMean;

        number1 = -10.5;
        number2 = 42.5;

        arithmeticMean = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
        geometricMean = Math.sqrt(Math.abs(number1) * Math.abs(number2));

        System.out.println("The arithmetic mean is " + arithmeticMean +
                            "\nThe geometric mean is " + geometricMean);
    }
}
