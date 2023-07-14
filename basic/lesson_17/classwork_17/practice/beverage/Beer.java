package practice.beverage;

public class Beer extends Beverage {


    String type;// light or dark


    //конструктор
    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }

    //метод для закупки
    //мы переопределили родительский метод
    public void toBuy (String title,String packing,int quantity,String type){
        super.toBuy(title,packing,quantity);
        this.type = type;

    }
    //метод для показа того , что в кладовке
    //мы переопределили родительский метод
    public void displayStock (){
        super.displayStock();
        System.out.println("This is " + type + " beer.");
    }

    public Beer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //Пустой конструктор для класса Beer
    public Beer() {
    }
}
