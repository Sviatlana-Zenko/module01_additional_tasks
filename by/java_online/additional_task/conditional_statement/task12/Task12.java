/*
 * Даны действительные числа x и y, не равны друг другу.
 * Меньшее из двух чисел заменить половиной их суммы,
 * а большее - их удвоенным произведением.
 */

package by.java_online.additional_task.conditional_statement.task12;

public class Task12 {
    public static void main(String[] args) {
        double x;
        double y;
        double newX;
        double newY;

        x = 4.44;
        y = 3.14;

        if (x < y) {
            newX = (x + y) / 2;
            newY = 2 * (x * y);
        } else if (y < x) {
            newY = (x + y) / 2;
            newX = 2 * (x * y);
        } else {
            System.out.println("Numbers are equal.");
            return;
        }

        System.out.println(x + " -> " + newX + "\n" + y + " -> " + newY);
    }
}
