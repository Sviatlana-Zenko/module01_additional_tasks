/*
 * Известна длина окружности. Найти площадь круга,
 * ограниченного этой окружностью.
 */

package by.java_online.additional_task.linear_program.task17;

public class Task17 {
    public static void main(String[] args) {
        double length;
        double radius;
        double area;

        length = 10.62;

        radius = length / (2 * Math.PI);
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The circle area is " + area);

        /*Вывод результатов вычисления с двумя знаками после запятой
		System.out.printf("The circle area is %.2f", area);*/
    }
}
