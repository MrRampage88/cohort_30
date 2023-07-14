import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Superman and his choice");

        Scanner scanner = new Scanner(System.in);//включили сканнер

        /*Задача 2. Написать приложение-калькулятор для 4-х математических действий: +, -, *, /
        Использовать switch ... case на основе int, char
        */

        System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Choose operation: 1 - +, 2 - -, 3 - *, 4 - /");
        //int operation = scanner.nextInt();//read choice operation
        String operation = scanner.next();

        switch (operation){
            case "+": {
                System.out.println("sum is " + (a+b));
                break;
            }
            case "-": {
                System.out.println("subtraction is " + (a-b));
                break;
            }
            case "*": {
                System.out.println("Multiplication is " + (a*b));
                break;
            }
            case "/": {
                double div = (double) (a / b);
                System.out.println("Division is " + div);
                break;
            }
            default:{
                System.out.println("Wrong input!");
            }
        }//end Switch






    }
}