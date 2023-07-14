import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Methods Practice");

        //определить количество цифр (делим в цикле число на 10 пока остаток от деления больше 0)
        Scanner sc = new Scanner(System.in);

        System.out.println("Input integer positive number: ");
        int num = sc.nextInt();

        int digits = numberOfDitits(num);
        System.out.println("Number of digits is: " + digits);

        // сумма

        int sumDigits = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sumDigits);




    }

    public static int numberOfDitits (int n) {
        int count = 1;//добавили счетчик цифр
        while (n / 10 > 0 ) {
            count++;//считаю количество цифр
            n = n/10;
        }
        return count;
    }

    public static int sumOfDigits (int n) {
        int sum = 0;
        while (n * 10 / 10 > 0 ) {
            sum = sum +  n % 10;//это цифра числа, их суммируем
            n = n/10;//уменьшаем числа в 10 раз
        }
        return sum;
    }
}