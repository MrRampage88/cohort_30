package productModel;

public class Product {
    private double price;  // Цена продукта
    String name;   // Название продукта
    long barCode;  // Штрих-код продукта

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product [" +
                "price = " + price +
                ", name = '" + name + '\'' +
                ", barCode = " + barCode +
                ']';
    }

    public double getPrice() {
        return price;
    }
}
