/*
 * Найти площадь равнобедренной трапеции с основаниями
 * a и b и углом альфа при большем основании a.
 */

package by.java_online.additional_task.linear_program.task19;

public class Task19 {
    public static void main(String[] args) {
        double a;
        double b;
        double angle;
        double height;
        double area;

        a = 8.2;
        b = 4.2;
        angle = 45;

        height = ((a - b) / 2) * Math.tan(Math.toRadians(angle));
        area = ((a + b) * height) / 2;

        System.out.println("The area is " + area);

        /*Вывод результатов вычисления с двумя знаками после запятой
		System.out.printf("The area is %.2f", area);*/
    }
}
