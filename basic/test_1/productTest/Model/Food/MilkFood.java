package productTest.Model.Food;

public class MilkFood extends Food {
    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", isOutOfDate=" + isOutOfDate() +
                ", milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
