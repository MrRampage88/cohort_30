import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //Возведите 3 в степень 10,
        // выведите все промежуточные результаты.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        int n = scanner.nextInt();

        //Алгоритм:
        //нужно число делить нацело на 10 до тех пор пока частное больше 0.
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0 ЦЕЛЫХ
        // НА КАЖДОМ ШАГУ УВЕЛИЧИВАЕМ СЧЕТЧИК НА 1.

        int count = 0;
        int div = n;

        while (div > 0) { //пока частное больше 0
            div = div / 10;// делим на 10, вычисляем частное
            count++;
        }
        System.out.println("Number of digits is: " + count);
    }
}