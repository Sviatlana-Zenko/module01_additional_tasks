/*
 * Составить линейную программу, печатующую значение true,
 * если указанное высказывание является истинным и false -
 * в противном случае:
 *
 * треугольник со сторонами a, b, c является равнобедренным.
 */

package by.java_online.additional_task.linear_program.task31;

public class Version06 {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;

        side1 = 2;
        side2 = 3.5;
        side3 = 3.5;

        // Проверяем, существует ли треугольник с заданными сторомами
        if (side1 + side2 > side3 &
                side2 + side3 > side1 &
                    side1 + side3 > side2) {

            System.out.println("The triangle is a isosceles triangle - ");
            if (side1 == side2 |
                    side2 == side3 |
                        side1 == side3) {

                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("This triangle doesn't exist.");
        }
    }
}
