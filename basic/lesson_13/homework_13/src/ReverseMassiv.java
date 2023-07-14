import java.util.Arrays;

public class ReverseMassiv {


    public static void main(String[] args) {
        // Пример вызова метода с массивом целых чисел
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        System.out.println("Развёрнутый массив: " + Arrays.toString(numbers));
    }

    // Метод для разворота массива
    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
}