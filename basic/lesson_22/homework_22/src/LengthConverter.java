import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 3. (switch case, бесконечный цикл, методы) Составьте программу для перевода мер длины:
        //
        //саженей в метры (1 сажень равна 2,1366 м)
        //дюймов в сантиметры (1 дюйм равен 2,5 см)
        //футов в метры (1 фут равен 0,3048 м)
        //аршинов в метры (1 аршин равен 0,7112 м)
        //дюймов в миллиметры (1 дюйм равен 25,3995 мм)


        int choice;

        while (true) {
            System.out.println("Выберите вариант перевода:");
            System.out.println("1. Сажени в метры");
            System.out.println("2. Дюймы в сантиметры");
            System.out.println("3. Футы в метры");
            System.out.println("4. Аршины в метры");
            System.out.println("5. Дюймы в миллиметры");
            System.out.println("0. Выход");

            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertSazhensToMeters();
                    break;
                case 2:
                    convertInchesToCentimeters();
                    break;
                case 3:
                    convertFeetToMeters();
                    break;
                case 4:
                    convertArshinsToMeters();
                    break;
                case 5:
                    convertInchesToMillimeters();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
    }

    private static void convertSazhensToMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество саженей: ");
        double sazhens = scanner.nextDouble();
        double meters = sazhens * 2.1366;
        System.out.println(sazhens + " саженей равно " + meters + " метрам.");
    }

    private static void convertInchesToCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дюймов: ");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.5;
        System.out.println(inches + " дюймов равно " + centimeters + " сантиметрам.");
    }

    private static void convertFeetToMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество футов: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.3048;
        System.out.println(feet + " футов равно " + meters + " метрам.");
    }

    private static void convertArshinsToMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество аршинов: ");
        double arshins = scanner.nextDouble();
        double meters = arshins * 0.7112;
        System.out.println(arshins + " аршинов равно " + meters + " метрам.");
    }

    private static void convertInchesToMillimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дюймов: ");
        double inches = scanner.nextDouble();
        double millimeters = inches * 25.3995;
        System.out.println(inches + " дюймов равно " + millimeters + " миллиметрам.");
    }
}
