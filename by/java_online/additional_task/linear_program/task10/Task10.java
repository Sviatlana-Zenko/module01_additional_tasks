/*
 * Заданы координаты трех вершин треугольника
 * (x1, y1), (x2, y2), (x3, y3).
 * Найти его периметр и площадь.
 */

package by.java_online.additional_task.linear_program.task10;

public class Task10 {
    public static void main(String[] args) {
        double x1 = 10;
        double x2 = 0;
        double x3 = 3;
        double y1 = -2;
        double y2 = 0;
        double y3 = 3;

        double side1;
        double side2;
        double side3;
        double perimeter;
        double area;

        side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        /*
         * Проверяем, существует ли треугольник с такими сторомами.
         * Если существует, то рассчитываем его периметр и площадь.
         */

        if ((side1 + side2 > side3) &
                (side2 + side3 > side1) &
                (side1 + side3 > side2)) {

            perimeter = side1 + side2 + side3;

            area = Math.sqrt(perimeter / 2 * (perimeter / 2 - side1) *
                    (perimeter / 2 - side2) * (perimeter / 2 - side3));

        } else {
            System.out.println("This triangle doesn't exist.");
            return;
        }

        System.out.println("The triangle perimeter is " + perimeter + ".\n" +
                            "The triangle area is " + area + ".");
    }
}
