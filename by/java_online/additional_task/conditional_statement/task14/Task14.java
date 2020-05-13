/*
 * Даны целые числа m и n. Если числа не равны, то заменить каждое
 * из них одним и тем же числом, равным большему из них, а если
 * равны, то заменить числа нулями.
 */

package by.java_online.additional_task.conditional_statement.task14;

public class Task14 {
    public static void main(String[] args) {
        double m;
        double n;
        double max;

        m = 13.18;
        n = 3.18;

        max = Math.max(m, n);

        if (m != n) {
            System.out.println("'m' (" + m + ") and 'n' (" + n + ") -> " + max);
            m = max;
            n = max;
        } else {
            System.out.println("'m' (" + m + ") and 'n' (" + n + ") -> 0");
            m = 0;
            n = 0;
        }
    }
}
