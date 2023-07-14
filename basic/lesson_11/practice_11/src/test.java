import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//Вводится n - натуральное число. Напишите метод, который получает на вход n
// и вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод.
// При каком значении n происходит переполнение памяти, выделяемой для n типа int?
// Использовать цикл for.
            Scanner in = new Scanner(System.in);
            System.out.println("Введите натуральное число n: ");
            int n = in.nextInt();
            long factorial = calculateFac(n);
            System.out.println("Факториал числа " + n + " равен: "+factorial);
            int maxInt = Integer.MAX_VALUE;
            int i = 1;
            while (i <= maxInt) {
                factorial = calculateFac(i);
                if (factorial < 0) {
                    System.out.println("Переполнение памяти типа int происходит при n = "+i);
                    break;
                }
                i++;
            }
        }
        public static long calculateFac(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result*i;
            }
            return result;
        }
    }
