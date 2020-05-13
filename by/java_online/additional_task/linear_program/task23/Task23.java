/*
 * Составить программу перевода радианной меры угла
 * в градусы, минуты и секунды.
 */

package by.java_online.additional_task.linear_program.task23;

public class Task23 {
    public static void main(String[] args) {
        double angleInRadians;
        double angleInDegrees;
        int degrees;
        int minutes;
        double seconds;

        angleInRadians = 4.5897;

        angleInDegrees = Math.toDegrees(angleInRadians);
        degrees = (int) Math.floor(angleInDegrees);
        minutes = (int) Math.floor((angleInDegrees - degrees) * 60);
        seconds = (((angleInDegrees - degrees) * 60) - minutes) * 60;

        System.out.println(angleInRadians + "(in radians):\n" +
                            degrees + " degrees\n" +
                            minutes + " minutes\n" +
                            seconds + " seconds");
    }
}
