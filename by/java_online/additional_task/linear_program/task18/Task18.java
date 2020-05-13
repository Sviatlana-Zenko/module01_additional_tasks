/*
 * Найти площадь кольца, внутренний радиус которой равен r,
 * а внешний - R (R > r).
 */

package by.java_online.additional_task.linear_program.task18;

public class Task18 {
    public static void main(String[] args) {
        double innerRadius;
        double outerRadius;
        double innerArea;
        double outerArea;
        double ringArea;

        innerRadius = 3.55;
        outerRadius = 6.88;

        innerArea = Math.PI * Math.pow(innerRadius, 2);
        outerArea = Math.PI * Math.pow(outerRadius, 2);
        ringArea = outerArea - innerArea;

        System.out.println("The ring area is " + ringArea);

        /*Вывод результатов вычисления с тремя знаками после запятой
		System.out.printf("The ring area is %.3f", ringArea);*/
    }
}
