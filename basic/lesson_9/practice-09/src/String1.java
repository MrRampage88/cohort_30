import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //Пользователь вводит строку.
        // Распечатайте каждую букву строки на новой строчке.

        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();
        System.out.println("String: " + st);

        int l = st.length();//определили длину строки
        System.out.println("length of string is: " + l);
        int pointer = 0;

        while (l > 0) {
            System.out.println(st.charAt(pointer));
            pointer++;//двигаем указатель по строке вправо
            l--;//сокрщаем длину строки
        }
    }
}
