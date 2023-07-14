package practice;

import java.util.Scanner;

public class isPrime {

    //Написать метод, определяющий, является ли число простым (primary).
    // Проcтое число - это число, которое делится только на себя и 1.
    // Примеры: 2, 7, 11, 19, 47.

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите число для проверки: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " является простым числом.");
            } else {
                System.out.println(number + " не является простым числом.");
            }
        }

    }
}