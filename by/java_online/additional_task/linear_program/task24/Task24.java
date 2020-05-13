/*
 * Найти (в радианах и градусах) все углы треугольника
 * со сторонами a, b, c.
 */

package by.java_online.additional_task.linear_program.task24;

import static java.lang.Math.acos;
import static java.lang.Math.pow;
import static java.lang.Math.toDegrees;

public class Task24 {
    public static void main(String[] args) {
        double a = 9;
        double b = 4;
        double c = 8;

        double alphaInRadians;
        double betaInRadians;
        double gammaInRadians;
        double alphaInDegrees;
        double betaInDegrees;
        double gammaInDegrees;

        alphaInRadians = acos((pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c));
        betaInRadians = acos((pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b));
        gammaInRadians = acos((pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * c * b));

        alphaInDegrees = toDegrees(alphaInRadians);
        betaInDegrees = toDegrees(betaInRadians);
        gammaInDegrees = toDegrees(gammaInRadians);

        System.out.println("First angle - " +
                            alphaInRadians + "(in radians), " +
                            alphaInDegrees + "(in degrees)\n" +
                            "Second angle - "
                            + betaInRadians + "(in radians), " +
                            betaInDegrees + "(in degrees)\n" +
                            "Third angle - " +
                            gammaInRadians + "(in radians), " +
                            gammaInDegrees + "(in degrees)");
    }
}
