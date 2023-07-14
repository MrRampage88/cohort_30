import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        /*Написать метод, выводящий на экран максимальное из трех целых чисел.
        Числа должны вводится с клавиатуры.
        */
        System.out.println("If - else practice - NEXT - NEXT");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number");
        int c = scanner.nextInt();

        /*Алгоритм:
        Шаг 1 = объявить переменную max
        Шаг 2 - присвоим max = a (любую из наших переменных)
        Шаг 3 - сравним b и max, если b > max то max = b.
        Шаг 4 - сравним c и max, если c > max то max = c.
         */

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int maximum = maxABC(a, b, c);//вызов метода и передача ему на вход три числа a,b,c.
        System.out.println("Max from " + a + ", " + b + ", " + c + " is: " + max);//print result


    }

    public static int maxABC(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = x;
        }
        if (z > max) {
            max = z;

        }
        return max;
    }
}
