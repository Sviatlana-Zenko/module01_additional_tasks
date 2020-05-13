/*
 * Составить программу нахождения разности кубов
 * первых двухсот чисел.
 */

package by.java_online.additional_task.cycle.task06;


public class Task06 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int difference;

        number1 = 1;
        number2 = 200;
        difference = 0;

        while (number1 <= number2) {
            int power;
            power = (int) Math.pow(number1, 3);

            difference -= power;
            number1++;
        }

        System.out.println("Difference is " + difference);
    }
}