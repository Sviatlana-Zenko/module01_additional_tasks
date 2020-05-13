/*
 * Написать программу - модель анализа пожарного датчика в поммещении,
 * которая выводит сообщение "Пожароопасная ситуация", если температура
 * в комнате превысила 60 градусов.
 */

package by.java_online.additional_task.conditional_statement.task21;

public class Task21 {
    public static void main(String[] args) {
        double temperature;

        temperature = 60.5;

        if (temperature > 60) {
            System.out.println("Fire hazard!");
        } else {
            System.out.println("Everything's cool!");
        }
    }
}
