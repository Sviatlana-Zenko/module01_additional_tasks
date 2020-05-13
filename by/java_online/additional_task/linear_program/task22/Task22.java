/*
 * Дано значение a. Не используя никаких функций и операций,
 * кроме умножения, получить значение а^8 за три опепрации и
 * а^10 за четыре операции.
 */

package by.java_online.additional_task.linear_program.task22;

public class Task22 {
    public static void main(String[] args) {
        int a;
        int secondPower;
        int fourthPower;
        int eighthPower;
        int tenthPower;

        a = 2;

        secondPower = a * a;     // 1-я
        fourthPower = secondPower * secondPower;     // 2-я
        eighthPower = fourthPower * fourthPower;     // 3-я
        tenthPower = eighthPower * secondPower;     // 4-я

        System.out.println("The eighth power is " + eighthPower + "\n" +
                            "The tenth power is " + tenthPower);
    }
}
