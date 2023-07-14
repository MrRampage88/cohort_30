package productModel;

public class MeatFood extends Food {
    private String meatType;  // Тип мяса

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood [" +
                "price = " + getPrice() +
                ", name = '" + super.name + '\'' +
                ", barCode = " + super.barCode +
                ", isOutOfDate = " + super.isOutOfDate +
                ", meatType = " + meatType + '\'' +
                ']';
    }
}
