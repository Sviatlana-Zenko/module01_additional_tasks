/*
 * Перераспределить значения переменных x и y так, чтобы в x
 * оказалось большее из этих значений, а в y - меньшее.
 */

package by.java_online.additional_task.conditional_statement.task18;

public class Task18 {
    public static void main(String[] args) {
        double x;
        double y;
        double max;

        x = 14.5;
        y = 19.5;

        if (x >= y) {
            System.out.println("'x' is already greater than 'y' " +
                                "(or 'x' is equal to 'y')");

            return;
        } else {
            System.out.print("x = " + x + ", y = " + y + " --> ");
            max = y;
            y = x;
            x = max;
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
