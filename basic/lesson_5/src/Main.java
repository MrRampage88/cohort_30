import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи на вычисления");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input cost of City ticket: ");
        double priceMonatKarte = scanner.nextDouble(); //считываем от пользователя стоимость месячного проездного
        System.out.println("Input number of working days in current month: ");
        int workingDays = scanner.nextInt();

        int trip = workingDays * 2;//количество поездок в рабочие дни
        int holydays = 31 - workingDays;
        int holyDayTrip = (int)Math.round(1.5 * holydays);

        //trip = trip + holyDayTrip;// так не очень хорошо , но вариант рабочий
        int trips ;//общее количество поездок
        trips = trip + holyDayTrip;
        System.out.println("number of trips in May:" + trips);

        double averageTripPrice = priceMonatKarte/trips;//вычисляем среднюю стоимость

        System.out.println("Average price: " + averageTripPrice);// выводим на печать

        System.out.printf("Average price = %.2f ", averageTripPrice);// выводим на печать

    }
}

        /*System.out.println("calculate length and area of circle.");//считаем длину и радиус окружности
        Scanner scanner = new Scanner(System.in);
        System.out.println("input radius of circle");
        double radius = scanner.nextDouble();

        double l = 2 * Math.PI * radius;//вычислили длину окружности

        double s = Math.PI * radius * radius;//вычислили радиус окружности

        float s1 = (float) (Math.PI * Math.pow(radius, 2));//вычислили радиус окружности .способ №2

        System.out.println("length of circle:" + l);
        System.out.println("Length of circle:" + s);
        System.out.println("Length of circle:" + s1);*/
