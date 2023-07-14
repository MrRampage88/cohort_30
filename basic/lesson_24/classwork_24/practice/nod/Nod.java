package practice.nod;

public class Nod {

    public int nod(Integer a, Integer b) {


        Integer nod = 1;

        // шаг 1 - найти меньшее их данных двух чисел
        Integer min = a;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        //шаг 2 - надо перебрать все числа меньшие меньшего их данных двух
        Integer res = 0;
        while (nod > min) {
            if(a % nod == 0 && b % nod == 0) {
                res = nod;
            }
                nod++;
        }
        return res;
    }

}












    //НОД (18,24) = , НОД (48,24) = , HOД (50,40) =

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        int gcd = findGCD(number1, number2);

        System.out.println("Наибольший общий делитель: " + gcd);
    }

    private static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;   // Временная переменная для хранения значения number2
            number2 = number1 % number2;   // Обновляем number2 с помощью остатка от деления number1 на number2
            number1 = temp;   // Присваиваем number1 значение временной переменной
        }
        return number1;*/

