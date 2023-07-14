public class homework_11 {
    public static void main(String[] args) {


        //Задача 1
        //
        //Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
        //Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Input your number :");
        double n = sc.nextDouble();
        double sum = 0;
        int i = 1;

        while (n>=i){
            sum = sum + (1.0/i);
            i++;
        }
        System.out.println("Output "+ sum);

         */

        //Задача 2
        //
        //Вводится n - натуральное число.
        // Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
        // Вызовите полученный метод.
        // При каком значении n происходит переполнение памяти,
        // выделяемой для n типа int? Использовать цикл for.


        /*Scanner sc = new Scanner(System.in);

        System.out.println("Input integer number please: ");

        int n = sc.nextInt();
            while (true) {
                int factorial = factorial(n);
                System.out.println("Factorial of " + n + ": " + factorial);
                if (factorial < 0) {
                    System.out.println("Overflow occurred at n = " + n);
                    break;
                }
                n++;
            }
        }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

         */

        int product = 1; // Инициализируем переменную для хранения произведения чисел
        for (int i = 13; i < 100; i += 13) { // Цикл для перебора чисел от 13 до 99 с шагом 13
            if (i % 2 == 1) { // Проверяем, является ли текущее число нечетным
                product *= i; // Умножаем текущее число на произведение
            }
        }
        System.out.println("Произведение двузначных нечетных чисел, кратных 13: " + product);


    }
}