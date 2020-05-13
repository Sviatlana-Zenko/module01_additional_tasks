/*
 * Вычислить периметр и площадь прямоугольного треугольника
 * по длинам a и b двух катетов.
 */

package by.java_online.additional_task.linear_program.task08;

public class Task08 {
    public static void main(String[] args) {
        double a;
        double b;
        double hypotenuse;
        double perimeter;
        double area;

        a = 4.44;
        b = 3.33;

        hypotenuse = Math.hypot(a, b);
        perimeter = a + b + hypotenuse;
        area = (a * b) / 2;

        System.out.println("The triangle perimeter is " + perimeter + ".\n" +
                            "The triangle area is " + area + ".");
    }
}
