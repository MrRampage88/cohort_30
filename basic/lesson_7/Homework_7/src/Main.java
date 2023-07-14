import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number of triangle :");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number of triangle :");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number of triangle :");
        int c = scanner.nextInt();
        String fl = ("Треугольник не существует.");
        String tr = ("Треугольник существует.");
        if (a == 0 | b == 0 | c == 0)
            System.out.println(fl);
        else if (a > (b + c))
            System.out.println(fl);
        else if (b > (a + c))
            System.out.println(fl);
        else if (c > (a + b))
            System.out.println(fl);
        else System.out.println(tr);
    }
}
