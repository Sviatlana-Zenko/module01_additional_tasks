/*
 * Написать программу, которая по паролю будет определять уровень доступа
 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
 * шесть человек, разбитых на три группы по степени доступа. Они имеют
 * следующие пароли: 9583, 1747 - доступны модули баз A, B, C; 3331, 7922 -
 * доступны модули баз B, C; 9455, 8997 - доступен модуль базы C.
 */

package by.java_online.additional_task.conditional_statement.task25;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int password;

        System.out.println("Enter your password:");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        password = input.nextInt();

        if (password == 9583 | password == 1747) {
            System.out.println("You have access to modules A, B, C.");
        } else if (password == 3331 | password == 7922) {
            System.out.println("You have access to modules B, C.");
        } else if (password == 9455 | password == 8997) {
            System.out.println("You have access to module C.");
        } else {
            System.out.println("You don't have access to the base. " +
                                "Check your password.");
        }
    }
}
