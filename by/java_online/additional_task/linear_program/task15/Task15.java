/*
 * Дана длина ребра куба. Найти площадь грани,
 * площадь полной поверхности и объем этог куба.
 */

package by.java_online.additional_task.linear_program.task15;

public class Task15 {
    public static void main(String[] args) {
        double edgeLength;  // Длина ребра
        double faceArea;  // Площадь грани
        double cubeArea;  // Площадь куба
        double cubeVolume;  // Объем куба

        edgeLength = 2.5;

        faceArea = Math.pow(edgeLength, 2);
        cubeArea = faceArea * 6;
        cubeVolume = Math.pow(edgeLength, 3);

        System.out.println("The face area is " + faceArea + "\n" +
                            "The cube area is " + cubeArea + "\n" +
                            "The cube volume is " + cubeVolume + "\n");
    }
}
