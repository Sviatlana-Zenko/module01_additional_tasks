/*
 * Найдите количество четных цифр данного натурального числа.
 */

package by.java_online.additional_task.cycle.task19;

public class Task19 {
    public static void main(String[] args) {
        int number;
        int counter;

        number = 4478;
        counter = 0;

        System.out.print("We have number " + number + ". ");
        while (number > 0) {
            int digit;
            digit = number % 10;

            if (digit % 2 == 0) {
                counter++;
            }
            number /= 10;
        }

        if (counter > 0) {
            System.out.println("It has " + counter + " even digit(s).");
        } else {
            System.out.println("It doesn't have even digits.");
        }
    }
}
