/*
 * Написать код для решения задачи.
 * В n малых бидонах 80 литров молока.
 * Сколько литров молока в m больших бидонах,
 * если в каждом большом бидоне на 12 литров
 * больше, чем в малом?
 */

package by.java_online.additional_task.linear_program.task05;

public class Task05 {
    public static void main(String[] args) {
        int n;
        int m;
        double smallVolume;
        double largeVolume;
        double volumeDifference;
        double totalVolume1;
        double totalVolume2;

        n = 32;
        m = 11;
        volumeDifference = 12;
        totalVolume1 = 80;

        smallVolume = totalVolume1 / n;
        largeVolume = smallVolume + volumeDifference;
        totalVolume2 = largeVolume * m;

        //totalVolume2 = ((totalVolume1 / n) + volumeDifference) * m;

        System.out.println("Total volume of large cans is " + totalVolume2);
    }
}
