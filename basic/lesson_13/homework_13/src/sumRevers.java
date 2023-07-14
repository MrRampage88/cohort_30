public class sumRevers {
    public static void main(String[] args) {
        //Задача 2. Написать метод, принимающий массив целых чисел,
        // и возвращающий произведение всех его элементов, с четными индексами.
        // 0 - тоже четное число.

        // Пример вызова метода с массивом целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int product = calculateProduct(numbers);
        System.out.println("Произведение элементов с четными индексами: " + product);
    }

    // Метод для вычисления произведения элементов с четными индексами
    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i += 2) {
            product *= array[i];
        }
        return product;
    }
}