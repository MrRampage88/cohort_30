package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        //как найти количество цифр в числе - версия 2 (цикл делим на число 10 пока оно не кончится)
        System.out.println("=========Digits in number========");
        Integer x = 987654321;
        String st = x.toString();
        System.out.println(" Number of digits in " + x + " are "+ st.length());
        double y = 32456.78;
        //String st2 = y.toStrinng
        //System.out.println(" Number of digits in " + y + " are " + st1.length());


        // Присвоения и вычисления
        System.out.println("========Calculation=======");

        int n = 20;
        Integer z = 10;
        System.out.println(n);
        System.out.println(z);
        z = z + 100;
        System.out.println(z);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);


        System.out.println("========Constants of Wrapper Classes===========");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);

        System.out.println(("=======Not-a-Number (NaN)========"));
        double a = 20.0 / 0;
        if(Double.isInfinite(a)) {
            System.out.println("Wrong operation or wrong result.");
        }else {
            System.out.println(a);
        }

        //парсинг String to number (приведение строки к числу)

        String st1 = "987654";
        int num = Integer.parseInt(st1);//парсинг строки в число
        System.out.println(num);
        String st2 = "2.7118281828";
        double exp = Double.parseDouble(st2);
        System.out.println(exp);

    }
}
