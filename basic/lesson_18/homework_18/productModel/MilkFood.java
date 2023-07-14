package productModel;

public class MilkFood extends Food {
    private String milkType;  // Тип молока
    private double fat;       // Жирность продукта

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "MilkFood [" +
                "price = " + getPrice() +
                ", name = '" + super.name + '\'' +
                ", barCode = " + super.barCode +
                ", isOutOfDate = " + super.isOutOfDate +
                ", milkType = '" + milkType + '\'' +
                ", fat = " + fat +
                ']';
    }
}
