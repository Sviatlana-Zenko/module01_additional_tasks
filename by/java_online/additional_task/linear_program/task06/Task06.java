/*
 * Дан прямоугольник, ширина которого в два раза
 * меньше длины. Найти площадь прямоугольника.
 */

package by.java_online.additional_task.linear_program.task06;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double rectangleArea;

        System.out.println("Enter the length of a rectangle");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        length = input.nextDouble();

        if (length <= 0) {
            System.out.println("The rectangle length can't be " +
                                "negative or equal to zero.");

            return;
        } else {
            width = length / 2;
            rectangleArea = length * width;
        }

        System.out.println("The rectangle area is " + rectangleArea);
    }
}
