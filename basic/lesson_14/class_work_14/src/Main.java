public class Main {
    public static void main(String[] args) {
        //напечатать каждый второй элемент массива

        int [] elements = {56 , 73, 15, -10, 37, -14, 25, 65, 33, 38};

        for (int i = 0; i < elements.length; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(elements[i] + " , ");

        }
        int n = 553;
        //найти первый делитель введенного числа
        for (int i = 2; i < n-1 ; i++) {
            if (n % i == 0){
                System.out.println("553 делится нацело на "+ i);
                break;
            }

        }

        //найти первый делить введенного числа


    }
}