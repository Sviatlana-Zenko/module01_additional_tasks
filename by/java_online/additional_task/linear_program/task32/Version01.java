/*
 * Для данных областей составить составить линейную программу,
 * которая печатаеат true, если точка с координатами (x, y)
 * принадлежит закрашенной области, и false -  в противном случае.
 */

package by.java_online.additional_task.linear_program.task32;

public class Version01 {
    public static void main(String[] args) {
        int x1 = -4;
        int x2 = 0;
        int x3 = 4;
        int y1 = 0;
        int y2 = 4;
        int y3 = 0;
        double x = 1.5;
        double y = 1.5;

        if (y < 0 | y > y2 | x > x3 | x < x1) {
            System.out.println("false");
            return;
        }

        /*
         * Чтобы определить, лежит ли точка внутри треугольника,
         * мы будем вычислять 3 векторных произведения
         * (expression1, expression2, expression3)
         */

        double expression1;
        double expression2;
        double expression3;

        expression1 = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y);
        expression2 = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);
        expression3 = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);

        /*
         * Если все три значения одинакового знака, то точка лежит
         * внутри треугольника, если значение равно нулю, то точка
         * лежит на стороне треугольника. В ином случае
         * (если значения различные по знаку), точка вне треугольника
         */

        if ((expression1 >= 0 & expression2 >= 0 & expression3 >= 0) |
                (expression1 <= 0 & expression2 <= 0 & expression3 <= 0)) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
