/*
 * В трехзначном числе зачеркнули старшую цифру.
 * Когда полученное число умножили на 7, то получили
 * исходное число. Найти это число.
 */

package by.java_online.additional_task.cycle.task15;

public class Task15 {
    public static void main(String[] args) {
        int threeDigitNumber;
        int digit;
        int numberToFind;

        threeDigitNumber = 841;
        digit = 7;

        threeDigitNumber %= 100;
        numberToFind = threeDigitNumber * digit;

        System.out.println("Our number is " + numberToFind);
    }
}
