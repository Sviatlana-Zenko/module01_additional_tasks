/*
 * Составить программу, которая определит
 * площадь какого круга меньше.
 */

package by.java_online.additional_task.conditional_statement.task10;

public class Task10 {
    public static void main(String[] args) {
        double radius1;
        double radius2;
        double area1;
        double area2;

        radius1 = 15.4;
        radius2 = 17.8;

        area1 = Math.PI * Math.pow(radius1, 2);
        area2 = Math.PI * Math.pow(radius2, 2);

        if (area1 < area2) {
            System.out.println("The first area is less than the second");
        } else if (area2 < area1) {
            System.out.println("The second area is less than the first");
        } else {
            System.out.println("They are equal");
        }
    }
}
