import java.io.PrintStream;

public class Student {
    public static void main(String[] args) {
        //Задача 1. Имеются оценки абитуриента из его аттестата,
        // всего 12 оценок. Найдите средний балл абитуриента.
        System.out.println("Average marks of students");
        int[] array = {4,3,3,4,5,3,4,5,4,5,4,5};
        double sum = 0;
        // Для нахождения среднего балла первым шагом будет суммирование всех оценок.
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];// суммируем оценки
            // для нахождения среднего балла делим сумму на количество оценок
            double result = (double) sum / array.length;
            System.out.println("Средний балл абитуриента: "+ result);
            PrintStream printf = System.out.printf("Средний балл абитуриента: %.02f", result);

        }

    }
}
