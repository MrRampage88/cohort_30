public class LuckyPelmen {
    public static void main(String[] args) {

        //Задача 3. Задача про поиск "счастливого пельменя", часть 2.
        // Хозяйка налепила для гостей 30 пельменей.
        // В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
        // Напишите программу, которая ищет счастливый пельмень.
        int[] weights = {33, 32, 28, 31, 29, 30, 30, 29, 45, 30, 33, 30, 30, 29, 30, 30, 30, 30, 31, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};

        int luckyPelmenIndex = findLuckyPelmen(weights);

        if (luckyPelmenIndex != -1) {
            System.out.println("Счастливый пельмень найден! Индекс: " + luckyPelmenIndex);
        } else {
            System.out.println("Счастливый пельмень не найден.");
        }
    }

    public static int findLuckyPelmen(int[] weights) {
        for (int i = 0; i < weights.length; i++) {
            int originalWeight = weights[i];
            int increasedWeight = originalWeight + 15;

            if (increasedWeight == 30) {
                return i;
            }
        }

        return -1; // Счастливый пельмень не найден
    }
}
