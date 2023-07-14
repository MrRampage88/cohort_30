public class numbers {
    public static void main(String[] args) {
        //Задача 2. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        // Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
        // Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
        // а возвращает ответ - нашлось ли это число в массиве.

        int[] num = new int[10];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайных чисел
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }

        printArray(num);

    }

    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }

    }
}
