public class Rocket {
    public static void main(String[] args) {
        //Запустить обратный отсчет старта ракеты от 10 до 0.
        //Последнее сообщение: "Поехали!...".

        int countdown = 10;//параметр цикла (счетчик)

        while (countdown != 0) {
            System.out.println("To start left: " + countdown);
            countdown--; //измегяем параметр цикла
        }//end of while

        System.out.println("Поехали!...");
    }//end of method main
}//end of class "Rocket"
