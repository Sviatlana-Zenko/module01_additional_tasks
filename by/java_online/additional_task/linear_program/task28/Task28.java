/*
 * Ввести любой символ и определить его порядковый номер,
 * а также указать предыдущий и последующий символы.
 */

package by.java_online.additional_task.linear_program.task28;

public class Task28 {
    public static void main(String[] args) {
        char symbol;
        int symbolNumber;
        char previous;
        char next;

        symbol = 'j';

        symbolNumber = symbol;
        previous = (char) (symbolNumber - 1);
        next = (char) (symbolNumber + 1);


        System.out.println("Symbol '" + symbol + "' has serial number " +
                            symbolNumber + ". Previous symbol is '" + previous +
                            "'. Next symbol is '" + next + "'.");
    }
}
