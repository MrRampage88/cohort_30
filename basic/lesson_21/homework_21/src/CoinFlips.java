import java.util.Scanner;

public class CoinFlips {
    public static void main(String[] args) {
        //Задача 3. На столе лежат n монеток.
        // Некоторые из них лежат вверх решкой, а некоторые – гербом.
        // Определите минимальное число монеток, которые нужно перевернуть,
        // чтобы все монетки были повернуты вверх одной и той же стороной.



        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество монет: ");
        int n = scanner.nextInt();

        System.out.print("Введите расположение монет (Р - решка, Г - герб): ");
        String coins = scanner.next();

        int flipsNeeded = minFlips(coins);

        System.out.println("Минимальное число переворотов: " + flipsNeeded);
    }

    private static int minFlips(String coins) {
        int headsCount = 0; // Количество монеток решкой вверх
        int tailsCount = 0; // Количество монеток гербом вверх

        for (char c : coins.toCharArray()) {
            if (c == 'Р') {
                headsCount++;
            } else if (c == 'Г') {
                tailsCount++;
            }
        }

        return Math.min(headsCount, tailsCount);
    }
}
