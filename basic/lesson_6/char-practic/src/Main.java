

public class Main {
    public static void main(String[] args) {

        System.out.println("String practic");
        String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st);//печаем строку

        char lastSymbol = st.charAt(59);//определяем последний символ по номеру индекса
        System.out.println("Last symbol: " + lastSymbol);

        int l = st.length();//определяем длину строки
        System.out.println("Length of string is: " + l );//выводим длину строки на вывод

        //находим позицию подстроки "Java" в строке "I like Java!".
        String st1 = "I like Java!";//задали строку
        int index = st1.indexOf("Java");//узнаем с какого индекса начинается слово Java
        System.out.println("Java starts from index " + index);//вывод результата

        st1.indexOf("like");
        int index1 = st1.indexOf("like");
        System.out.println("Like starts from index " + index1);


        //Проверим содержит ли заданная строка подстроку "Java".
        boolean yesOrno = st.contains("Java");
        System.out.println(yesOrno);// печатаем результат

        //Заменяем букву А на Букву О в предложении.
        String ao = st.replace("a","o");//замена буквы А на О
        System.out.println(ao);//Вывод строки

        //Преобразование строку к верхнему регистру,
        String toLower = st.toLowerCase();
        System.out.println(toLower);

        //Преобразование строку к нижнему регистру.
        String toUpper = st.toUpperCase();
        System.out.println(toUpper);

        //Вырезать строку Java.
        String javaSt = st.substring(7,11);
        System.out.println(javaSt);


        //Проверяем заканчивается ли строка "!!!".
        // привыкаем к типу boolean.
        String iLikeJ = "I Like Java!!!";
        yesOrno = iLikeJ.endsWith("!!!");
        System.out.println(yesOrno);
        yesOrno = iLikeJ.startsWith("I2");
        System.out.println(yesOrno);















        //chatAt("Java", 2) получаем символ V - третья цифра ,по индексу второй поэтому в ковычках 2









      /*  System.out.println("Type char - practic");

        char ch = 65;
        System.out.println("Symbol with number 65 :" + ch);//это А

        char ch1 = 90;
        System.out.println("Symbol with number 90 :" + ch1);//это Z

        char ch3 = 176;
        System.out.println("Temperature 23" + ch3);//градусы

        char ch4 = 178;
        System.out.println("10" + ch4);*/






    }
}