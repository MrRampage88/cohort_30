package productModel;

public class Food extends Product {
    boolean isOutOfDate;  // Флаг, указывающий на просроченность продукта

    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

    @Override
    public String toString() {
        return "Food [" +
                "price = " + getPrice() +
                ", name = '" + super.name + '\'' +
                ", barCode = " + super.barCode +
                ", isOutOfDate = " + isOutOfDate +
                ']';
    }
}
