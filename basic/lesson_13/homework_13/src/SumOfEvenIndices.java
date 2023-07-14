public class SumOfEvenIndices {
    public static void main(String[] args) {
        // Создаем массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вычисляем сумму произведений четных индексов
        int sum = calculateSum(numbers);

        System.out.println("Сумма произведений четных индексов: " + sum);
    }

    // Метод для вычисления суммы произведений четных индексов
    public static int calculateSum(int[] array) {
        int sum = 0;

        // Итерируемся по массиву с шагом 2, начиная с нулевого индекса
        for (int i = 0; i <= 9; i += 2) {
            sum += array[i + 1];
        }

        return sum;
    }
}