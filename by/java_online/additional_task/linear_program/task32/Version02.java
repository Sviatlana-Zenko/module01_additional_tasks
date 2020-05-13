/*
 * Для данных областей составить составить линейную программу,
 * которая печатаеат true, если точка с координатами (x, y)
 * принадлежит закрашенной области, и false -  в противном случае.
 */

package by.java_online.additional_task.linear_program.task32;

public class Version02 {
    public static void main(String[] args) {
        int radius1;
        int radius2;
        double x;
        double y;
        double distance;  // Расстояние от центра координат до точки

        radius1 = 4;
        radius2 = 5;
        x = 3;
        y = 0.5;

        /*
         * Изначально отметаем все точки, которые точно лежат
         * за пределами заданной области
         */

        if (x < 0 | x > 5 | y > 4 | y < -5) {
            System.out.println("false");
            return;
        }

        distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));

        if ((y > 0 & distance <= radius1) | (y <= 0 & distance <= radius2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
