/*
 * Дана сторона равностороннего треугольника.
 * Найти площадь этого треугольника, его высоту,
 * радиусы вписанной и описанной окружностей.
 */

package by.java_online.additional_task.linear_program.task16;

public class Task16 {
    public static void main(String[] args) {
        double sideLength;
        double area;
        double height;
        double radius1;  // Радиус описанной окружности
        double radius2;  // Радиус вписанной окружности

        sideLength = 3;

        area = Math.sqrt(3) / 4 * Math.pow(sideLength, 2);
        height = Math.sqrt(3) / 2 * sideLength;
        radius1 = sideLength / Math.sqrt(3);
        radius2 = radius1 / 2;

        System.out.println("The triangle area is " + area + "\n" +
                            "The triangle height is " + height + "\n" +
                            "The radius of a circumscribed circle is " + radius1 + "\n" +
                            "The radius of a inscribed circle is " + radius2 + "\n");

        /*Вывод результатов вычисления с двумя знаками после запятой
		System.out.printf("The triangle area is %.2f\n" +
				           "The triangle height is %.2f\n" +
				           "The radius of a circumscribed circle is %.2f\n" +
				           "The radius of a inscribed circle is %.2f\n",
				           area, height, radius1, radius2);*/
    }
}
