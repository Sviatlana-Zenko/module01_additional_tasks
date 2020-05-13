/*
 * Составить программу для вычисления пути, пройденного лодкой,
 * если ее скорость в стоячей воде v км/ч, скорость течения реки
 * v1 км/ч, время движения по озеру t1 ч, а против течения реки - t1 ч.
 */

package by.java_online.additional_task.linear_program.task26;

public class Task26 {
    public static void main(String[] args) {
        double v;
        double v1;
        double t1;
        double t2;
        double distance;

        v = 5.5;
        v1 = 2;
        t1 = 3.5;
        t2 = 6.5;

        distance = (v * t1) + ((v - v1) * t2);

        System.out.println("Distance - " + distance);
    }
}
