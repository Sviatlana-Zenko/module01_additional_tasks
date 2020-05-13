/*
 * Вычислить расстояние между двумя точками
 * с данными координатами (x1, y1) и (x2, y2).
 */

package by.java_online.additional_task.linear_program.task09;

public class Task09 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double result;

        x1 = 5.55;
        x2 = -3.55;
        y1 = 0;
        y2 = 8.55;

        result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance between two points is " + result);
    }
}
