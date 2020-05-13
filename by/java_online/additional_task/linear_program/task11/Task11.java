/*
 * Вычислить длину окружности и площадь круга
 * одного и того же заданного радиуса R.
 */

package by.java_online.additional_task.linear_program.task11;

public class Task11 {
    public static void main(String[] args) {
        double r;
        double length;
        double area;

        r = 5.55;

        length = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);

        System.out.println("The circle length is " + length + ".\n" +
                            "The circle area is " + area + ".");
    }
}
