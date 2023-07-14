import java.util.Scanner;

public class ReverseString {
    //Задание №3
    //Пользователь вводит строку.
    // Распечатайте эту строку в обратном порядке.

    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        // Вызываем метод для распечатки строки в обратном порядке
        printReverseString(input);
    }

    // Метод для распечатки строки в обратном порядке
    public static void printReverseString(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Строка в обратном порядке: " + reversed);
    }
}

