public class PelmeniWeights {
    public static void main(String[] args) {
        //Задача 2. (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел)
        // Задача про поиск "счастливого пельменя", часть 1.
        // Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
        // Напишите программу, которая занесет в массив данные
        // о весе каждого слепленного пельменя.


        int[] weights = new int[30]; // Создаем массив для хранения веса пельменей

        // Заполняем массив случайными значениями от 25 до 35
        for (int i = 0; i < weights.length; i++) {
            weights[i] = generateRandomWeight(25, 35);
        }

        // Выводим массив на печать
        System.out.println("Вес пельменей:");
        for (int weight : weights) {
            System.out.println(weight + " г");
        }
    }

    // Метод для генерации случайного числа в заданном диапазоне
    public static int generateRandomWeight(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
