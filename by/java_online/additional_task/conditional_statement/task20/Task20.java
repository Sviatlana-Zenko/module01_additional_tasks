/*
 * Составить программу, определяющую результат гадания на ромашке -
 * "любит - не любит", взяв за исходное данное количество лепестком n.
 */

package by.java_online.additional_task.conditional_statement.task20;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int numberOfPetals;

        System.out.println("Enter your number of petals:");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        numberOfPetals = input.nextInt();

        if (numberOfPetals <= 0) {
            System.out.println("Can't calculate the result. Number shouldn't " +
                                "be negative or equal to zero.");

        } else if (numberOfPetals % 2 != 0) {
            System.out.println("He/She loves you!");
        } else {
            System.out.println("He/She doesn't love you!");
        }
    }
}
