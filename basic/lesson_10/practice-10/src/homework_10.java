public class homework_10 {
    public static void main(String[] args) {
        //Задача 1
        //
        //С клавиатуры вводятся N чисел.
        // Составьте программу, которая определяет кол-во отрицательных,
        // кол-во положительных и кол-во нулей среди введеных чисел.
        // Значение N вводится с клавиатуры.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел N:");
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        System.out.println("Введите числа: ");
        int i = 0;
        while (i < n) {
            int number = sc.nextInt();
            if (number > 0) {
                pos++;
            } else if (number < 0) {
                neg++;
            } else {
                zero++;
            }
            i++;
        }
        System.out.println("Кол-во положительных чисел:" + pos);
        System.out.println("Кол-во отрицательных чисел:" + neg);
        System.out.println("Кол-во нулей:"+zero);

        */

        //Задача 2
        //
        //В сберкассу на трёхпроцентный вклад положили S рублей.
        // Какой станет сумма вклада через N лет?

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите предпочитаемую сумму вклада(руб.):");
        double sum = in.nextInt();
        System.out.println("На сколько лет вы бы хотели вложить сумму:");
        double year = in.nextInt();
        double sum1 = sum;
        while (year>0) {
            sum1 = (sum1 /100) * 3;
            sum = sum + sum1;
            year--;
        }
        System.out.println("Ваша сумма через установленное вами количество лет " + sum);

         */


        //Задача 3
        //
        //Написать метод, определяющий максимум из трех натуральных чисел.
        //Метод должен быть защищен от ввода отрицательных чисел.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел N:");
        int n = in.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Введите числа: ");
        int i = 0;
        while (i < n) {
            int number = in.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            i++;
        }
        System.out.println("Кол-во положительных чисел:"+positive);
        System.out.println("Кол-во отрицательных чисел:"+negative);
        System.out.println("Кол-во нулей:"+zero);

         */

        //Задача 4 (*)
        //
        //Написать программу, которая принимает с клавиатуры номер месяца и год ,
        //и выводит на экран название месяца и количество дней в нем.
        //(повторение условного оператора)

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца (от 1 до 12):");
        int month = in.nextInt();
        System.out.println("Введите год:");
        int year = in.nextInt();
        String monthName;
        int daysInMonth;
        switch (month) {
            case 1:
                monthName = "Январь";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "Февраль";
                if (LeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthName = "Март";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "Апрель";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "Май";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "Июнь";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "Июль";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "Август";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "Сентябрь";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "Октябрь";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "Ноябрь";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "Декабрь";
                daysInMonth = 31;
                break;
            default:
                monthName = "Неверный номер месяца";
                daysInMonth = 0;
                break;
        }
        System.out.println("Название месяца: " + monthName);
        System.out.println("Количество дней: " + daysInMonth);
    }
    public static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

         */
    }
}


