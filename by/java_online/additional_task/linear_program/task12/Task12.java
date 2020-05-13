/*
 * Написать программу, которая выводит на экран
 * первые четыре степени числа Пи.
 */

package by.java_online.additional_task.linear_program.task12;

public class Task12 {
    public static void main(String[] args) {
        int counter;
        double power;

        counter = 1;

        while (counter <= 4) {
            power = Math.pow(Math.PI, counter);
            System.out.println("The " + counter + " power of the number Pi is " + power);
            counter++;
        }
    }
}
