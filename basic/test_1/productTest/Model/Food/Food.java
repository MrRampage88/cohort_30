package productTest.Model.Food;

import productTest.Model.Product;

public class Food extends Product {
    private boolean isOutOfDate;

    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", isOutOfDate=" + isOutOfDate +
                '}';
    }
}

