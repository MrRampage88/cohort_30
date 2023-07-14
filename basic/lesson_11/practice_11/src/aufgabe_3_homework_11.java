import java.util.Scanner;

public class aufgabe_3_homework_11 {

    //Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
    // Через сколько лет его долг превысит s тысяч рублей,
    // если за это время он не будет отдавать долг.
    public static int calculateYearsToExceedDebt(double loanAmount, double interestRate, double targetAmount) {
        double debt = loanAmount; // Изначальная сумма долга равна сумме ссуды
        double interestRatePerYear = interestRate / 100.0; // Годовая процентная ставка в долях

        int years = 0; // Счетчик лет, инициализированный нулем
        while (debt <= targetAmount) { // Пока долг не превысит целевую сумму
            double interest = debt * interestRatePerYear; // Рассчитываем сумму процентов за год
            debt += interest; // Увеличиваем долг на сумму процентов
            years++; // Увеличиваем счетчик лет
        }

        return years; // Возвращаем количество лет
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму ссуды (тыс. руб.): ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите целевую сумму (тыс. руб.): ");
        double targetAmount = scanner.nextDouble();

        int yearsToExceedDebt = calculateYearsToExceedDebt(loanAmount, interestRate, targetAmount);
        System.out.println("Через " + yearsToExceedDebt + " лет долг превысит " + targetAmount + " тыс. рублей.");
    }
}

