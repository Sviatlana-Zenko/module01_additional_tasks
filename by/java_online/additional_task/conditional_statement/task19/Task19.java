/*
 * Определить правильность даты, ввседенной с клавиатуры (число - от 1 до 31,
 * месяц - от 1 до 12). Если введены некорректные данные, то сообщить об этом.
 */

package by.java_online.additional_task.conditional_statement.task19;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int day;
        int month;

        day = enterValue("Enter day");
        month = enterValue("Enter month");

        if ((day < 1 | day > 31) & (month < 1 | month > 12)) {
            System.out.println("Incorrect input. Correct values for variable " +
                                 "'day' - from 1 to 31 and for variable 'month' - " +
                                "from 1 to 12");

            return;
        } else if (day < 1 | day > 31) {
            System.out.println("Incorrect input. Correct values for variable " +
                                "'day' - from 1 to 31");

            return;
        } else if (month < 1 | month > 12) {
            System.out.println("Incorrect input. Correct values for variable " +
                               "'month' you need to enter number from 1 to 12");

            return;
        }

        System.out.println("The date you entered: " + day + "." + month + ".");
    }

    public static int enterValue(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int value;

        System.out.println(message);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        value = input.nextInt();

        return value;
    }
}
