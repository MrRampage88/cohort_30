import java.util.Scanner;

public class DivisorsArray {
    public static void main(String[] args) {

        //Задача 2. (на повторение темы массивы, циклы и вычисления)
        // Вводится пользователем натуральное число n.
        // Сформировать массив из всех делителей данного числа.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        int[] divisors = findDivisors(n);

        System.out.println("Массив делителей числа " + n + ":");
        printArray(divisors);
    }

    // Метод для нахождения всех делителей числа
    public static int[] findDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] divisors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index] = i;
                index++;
            }
        }

        return divisors;
    }

    // Метод для печати массива
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}