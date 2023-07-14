import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        //Задача 1. Составьте программу,
        // которая вычисляет сумму чисел от 1 до N.
        // Значение N вводится с клавиатуры.

        Scanner sc = new Scanner(System.in);


        System.out.println("Sum of numberts lees than N");
        System.out.println("Input your number please");

        int n = sc.nextInt();
        int i = 0;// задааем переменную и даем ей начальное значение
        int sum = 0;//задаем переменную и даем ей начальное значение


        while ( i < n ) {
            //внутри цикла что то повторяется

            sum = sum + (i + 1);//суммируем 1,2,3 и т.д
            i = i + 1;//увеличиваем параметр цикла
            //System.out.println("i = " + i);
            System.out.println("Sum = " + sum);
        }


        //
    }
}
