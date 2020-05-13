/*
 * На плоскости XOY задана своими координатами точка A. Указать, где она
 * расположена (на какой оси или в каком координатном угле).
 */

package by.java_online.additional_task.conditional_statement.task13;

public class Task13 {
    public static void main(String[] args) {
        double x;
        double y;

        x = -2.15;
        y = 0;

        if (x != 0) {

            if (y == 0) {
                System.out.println("Point is located on the X-axis.");
            } else if (x > 0 & y > 0) {
                System.out.println("Point is located in the first quadrant.");
            } else if (x > 0 & y < 0) {
                System.out.println("Point is located in the fourth quadrant.");
            } else if (x < 0 & y > 0) {
                System.out.println("Point is located in the second quadrant.");
            } else if (x < 0 & y < 0) {
                System.out.println("Point is located in the third quadrant.");
            }

        } else if (x == 0) {

            if (y != 0) {
                System.out.println("Point is located on the Y-axis.");
            } else if (y == 0) {
                System.out.println("This is the origin point.");
            }

        }
    }
}
