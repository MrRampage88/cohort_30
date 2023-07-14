public class test_2 {
        public static int calculateYearsToExceedDebt(int loanAmount, double interestRate, int targetAmount) {
            double debt = loanAmount * 1000; // Преобразуем сумму ссуды в рублях
            double interestRatePerYear = interestRate / 100; // Преобразуем годовую процентную ставку в десятичное число

            int years = 0;
            while (debt <= targetAmount * 1000) { // Преобразуем целевую сумму в рублях
                double interest = debt * interestRatePerYear;
                debt += interest;
                years++;
            }

            return years;
        }

        public static void main(String[] args) {
            int loanAmount = 300; // Ссуда в тысячах рублей
            double interestRate = 10; // Годовая процентная ставка
            int targetAmount = 500; // Целевая сумма в тысячах рублей

            int yearsToExceedDebt = calculateYearsToExceedDebt(loanAmount, interestRate, targetAmount);
            System.out.println("Через " + yearsToExceedDebt + " лет долг превысит " + targetAmount + " тысяч рублей.");
        }
    }
