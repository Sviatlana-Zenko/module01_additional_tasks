/*
 * Составить программу, которая определит по трем сторонам,
 * является ли данный треугольник равносторонним.
 */

package by.java_online.additional_task.conditional_statement.task09;

public class Task09 {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;

        side1 = 14.5;
        side2 = 9.48;
        side3 = 14.5;

        if (side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                    side2 + side3 > side1) {

            if (side1 == side2 | side2 == side3) {
                System.out.println("This is an equilateral triangle");
            } else {
                System.out.println("This is not an equilateral triangle");
            }

        } else {
            System.out.println("This triangle doesn't exist");
        }
    }
}
