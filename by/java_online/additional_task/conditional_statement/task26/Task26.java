/*
 * Составить программу, реализующую эпизод применения компьютера в книжном
 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
 * покупателем; если сдачи не требуется, печатает на экране слово "спасибо";
 * если денег внесено больше, чем необходимо, то печатает "возьмите сдачу"
 * и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об
 * этом и указывает размер недостающей суммы.
 */

package by.java_online.additional_task.conditional_statement.task26;

public class Task26 {
    public static void main(String[] args) {
        double price;
        double money;
        double change;

        price = 15.55;
        money = 16;

        change = money - price;

        if (change == 0) {
            System.out.println("Thank you for your purchase in our store.");
        } else if (change > 0) {
            System.out.printf("Thank you for your purchase in our store. " +
                                "Here's your change - %.2f", change);

        } else {
            System.out.printf("You don't have enough money to buy this book. " +
                                "You need to add %.2f", Math.abs(change));
        }
    }
}
