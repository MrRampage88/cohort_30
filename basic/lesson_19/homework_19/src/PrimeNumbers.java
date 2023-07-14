import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        //Задача 3.(*) (на повторение темы массивы, циклы и вычисления)
        // Найти все простые числа меньше введенного числа n и занести их в массив.
        // В консоли распечатать само число, количество найденных простых чисел и сами эти числа.
        // Пример: дано число 30 простые числа, меньшие 30 это: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 таких чисел: 10


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int[] primes = findPrimeNumbers(n);

        System.out.println("Простые числа, меньшие " + n + ":");
        printArray(primes);

        System.out.println("Количество простых чисел: " + primes.length);
    }

    // Метод для нахождения простых чисел меньше заданного числа
    public static int[] findPrimeNumbers(int n) {
        boolean[] isComposite = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                primes[index] = i;
                index++;
            }
        }

        return primes;
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
