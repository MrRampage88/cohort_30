import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Вычисление площади треугольника по формуле Герона");
        System.out.println("Введите сторону А: ");
        double a = in.nextDouble();
        System.out.println("Введите сторону B: ");
        double b = in.nextDouble();
        System.out.println("Введите сторону С: ");
        double c = in.nextDouble();
        double q = 2;
        double p = (a + b + c)/q;
        System.out.println("Полупериметр треугольника равен: " + p );
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника равна: " + S);
    }
}