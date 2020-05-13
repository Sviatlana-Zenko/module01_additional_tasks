/*
 * Последовательность an строится так: a1 = 1; an = 6 + a(n - 1),
 * для каждого n > 1. Составить программу нахождения произведения
 * первых 10 членов этой последовательности.
 */

package by.java_online.additional_task.cycle.task07;

public class Task07 {
    public static void main(String[] args) {
        int a;
        int b;
        int member;
        long product;

        a = 2;
        b = 10;
        member = 1;
        product = 1L;

        while (a < b) {
            product *= (6 + member);
            member += 6;
            a++;
        }

        System.out.println("Product is " + product);
    }
}


