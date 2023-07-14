public class WeeklyTemperature {
    public static void main(String[] args) {
        //Задача 1
        //
        //Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        // Выведите на печать температуру, которая была во вторник и затем в четверг.
        // Найти среднюю температуру за прошлую неделю.


        // Создаем массив для хранения данных о температуре
        int[] temperature = {25, 26, 24, 23, 27, 26, 25};

        // Выводим температуру во вторник (индекс 1 в массиве)
        System.out.println("Температура во вторник: " + temperature[1]);

        // Выводим температуру в четверг (индекс 3 в массиве)
        System.out.println("Температура в четверг: " + temperature[3]);

        // Находим среднюю температуру за неделю
        int sum = 0;
        for (int temp : temperature) {
            sum += temp;
        }
        int averageTemperature = (int) (sum / temperature.length);

        // Выводим среднюю температуру за неделю
        System.out.println("Средняя температура за неделю: " + averageTemperature);
    }
}
