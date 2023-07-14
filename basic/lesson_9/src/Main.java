import java.util.Scanner;
//Задание №1
public class Main {
    public static void main(String[] args) {


        //Задача 1
        //
        //Программа получает на вход строку и число повторений этой строки
        //Программа должна вывести эту строку нужное количество раз.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String example = scanner.next();
        System.out.println("Введите количество повторений введенной фразы:");
        int countdown = scanner.nextInt();
         while (countdown != 0){
             System.out.println(example);
             countdown--;
         }
        System.out.println("Сode completed!");



        //задание №2

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        int n = scanner.nextInt();



        int count = 0;
        int div = n;

        while (div > 0) { //пока частное больше 0
            div = div / 10;// делим на 10, вычисляем частное
            count++;
        }
        System.out.println("Number of digits is: " + count);

        */
    }
}