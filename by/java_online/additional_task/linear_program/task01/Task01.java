/*
 * Даны два действительных числа x и y.
 * Вычислить из сумму, разность, произведение и частное.
 */

package by.java_online.additional_task.linear_program.task01;

public class Task01 {
    public static void main(String[] args) {
        double x;
        double y;
        double sum;
        double difference;
        double product;
        double quotient;

        x = 2.22;
        y = -1.11;

        sum = x + y;
        difference = x - y;
        product = x * y;
        quotient = x / y;

        System.out.println("Sum = " + sum + "\n" +
                            "Difference = " + difference + "\n" +
                            "Product = " + product + "\n" +
                            "Quotient = " + quotient + "\n");

        /*Вывод результатов вычисления с двумя знаками после запятой
		System.out.printf("Sum = %.2f\n" +
				            "Difference = %.2f\n" +
				            "Product = %.2f\n" +
				            "Quotient = %.2f\n",
				            sum, difference, product, quotient);*/
    }
}
