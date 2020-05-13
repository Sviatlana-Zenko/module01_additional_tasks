/*
 * Текущее показание электронных часов: m ч (0 <= m <= 23),
 * n мин (0 <= n <= 59) и k с (0 <= k <= 59).
 * Какое время будут показывать часы через p ч q мин r с?
 */

package by.java_online.additional_task.linear_program.task27;

public class Task27 {
    public static void main(String[] args) {
        int m;
        int n;
        int k;
        int p;
        int q;
        int r;
        int sum;

        // Время на часах
        m = 18;
        n = 1;
        k = 8;

        // Время, которое мы прибавляем
        p = 15;
        q = 66;
        r = 98;

        // Рассчитываем количество секунд
        sum = k + r;
        n = n + (sum / 60);
        k = sum % 60;

        // Рассчитываем количество минут
        sum = n + q;
        m = m + (sum / 60);
        n = sum % 60;

        // Рассчитываем количество часов
        sum = m + p;
        if (sum > 23) {
            m = sum - ((sum / 24) * 24);
        } else {
            m = sum;
        }

        // Выводим последовательно часы, минуты, секунды
        printElement(m);
        System.out.print(":");
        printElement(n);
        System.out.print(":");
        printElement(k);
    }

    public static void printElement(int element) {
        if (element < 10) {
            System.out.print("0" + element);
        } else {
            System.out.print(element);
        }
    }
}
