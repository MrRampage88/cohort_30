public class MaxElement {
    public static void main(String[] args) {
        //Задача 2
        //
        //Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.

        // Создаем массив целых чисел
        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxElement = array[0];
        int maxIndex = 0;

        // Ищем максимальный элемент и его индекс в массиве
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        // Выводим максимальный элемент и его индекс на печать
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
