import java.util.Arrays;

public class ArrayPractic {
    public static void main(String[] args) {
        System.out.println("Array practice ");

        int[] marks = {2, 5, 4, 8, 5, 3, 5, 4, 1};

        int l = marks.length;
        System.out.println("Длина массива: " + l);
        System.out.println(marks);

        System.out.println(Arrays.toString(marks));

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
        }
    }
}
