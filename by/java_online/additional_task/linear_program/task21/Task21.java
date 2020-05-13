/*
 * Найти площадь треугольника, две стороны которого равны
 * a и b, а угол между этими сторонами y.
 */

package by.java_online.additional_task.linear_program.task21;

public class Task21 {
    public static void main(String[] args) {
        double a;
        double b;
        double angle;
        double area;

        a = 5.55;
        b = 6;
        angle = 45;

        area = (a * b * Math.sin(Math.toRadians(angle))) / 2;

        System.out.println("The triangle area is " + area);
    }
}
