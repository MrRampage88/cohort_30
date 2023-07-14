package productTest.Model.Food;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", isOutOfDate=" + isOutOfDate() +
                ", meatType='" + meatType + '\'' +
                '}';
    }
}
