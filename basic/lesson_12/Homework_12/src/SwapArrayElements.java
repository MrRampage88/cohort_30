import java.util.Arrays;
import java.util.Random;

public class SwapArrayElements {
    public static void main(String[] args) {
        //Задача 3
        //
        //Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать.
        // Поменяйте местами первый и последний элементы массива
        // и снова выведите массив на печать.



        // Создаем массив из 20 случайных целых чисел
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11) + 10; // Генерируем случайное число от 10 до 20
        }

        // Выводим исходный массив на печать
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Меняем местами первый и последний элементы массива
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        // Выводим измененный массив на печать
        System.out.println("Массив после замены: " + Arrays.toString(array));
    }
}