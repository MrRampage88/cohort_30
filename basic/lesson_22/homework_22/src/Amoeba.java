import java.util.Scanner;

public class Amoeba {
    public static void main(String[] args) {

        //Задача 2. (цикл) Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы. Необходимо определить,
        //сколько будет амёб через n часов, если первоначально была только одна амёба.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();

        int amoebas = countAmoebas(hours);

        System.out.println("Количество амёб через " + hours + " часов: " + amoebas);
    }

    private static int countAmoebas(int hours) {
        int amoebas = 1; // Начальное количество амёб

        for (int i = 1; i <= hours; i++) {
            amoebas *= 2; // Каждые 3 часа амёбы удваиваются
        }

        return amoebas;
    }
}
