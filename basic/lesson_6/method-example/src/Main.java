public class Main {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle with method");

        int a = 100;//1-я сторона прямоугольника
        int b = 300;//2-я стороная прямоугольника
        int per = perimeter(a,b);//вызов метода
        System.out.println("Perimeter = " + per);



    }//конец метода main
    //_________________Methods_________________
    public static int perimeter (int x,int y){ //Метод получает два целых числа
        //int p = (x+y)*2;
        //return p;
        return (x+y)*2;//возвращает результат
    }
    //_____________End of Methods+_____________
}//конец класса Main
