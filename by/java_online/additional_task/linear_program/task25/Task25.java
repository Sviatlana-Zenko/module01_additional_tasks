/*
 * Три сопротивления R1, R2 и R3 соединены параллельно.
 * Найти сопротивление соединения.
 */

package by.java_online.additional_task.linear_program.task25;

public class Task25 {
    public static void main(String[] args) {
        double r1;
        double r2;
        double r3;
        double totalResistance;

        r1 = 300;
        r2 = 350.5;
        r3 = 400.5;

        totalResistance = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

        System.out.println("Total resistance is " + totalResistance);
    }
}
