package productController;

import productModel.Food;
import productModel.MeatFood;
import productModel.MilkFood;
import productModel.Product;

public class ProductsAppl {
    public static void main(String[] args) {
        Product product1 = new Product(10.99, " Product 1 ", 1234567890);
        Food food1 = new Food(5.99, " Food 1 ", 9876543210L, true);
        MeatFood meatFood1 = new MeatFood(7.99, " Meat Food 1 ", 1122334455L, false, "Beef");
        MilkFood milkFood1 = new MilkFood(2.49, " Milk Food 1 ", 5432109876L, true, "Cow Milk", 3.5);

        Product[] products = {product1, food1, meatFood1, milkFood1};

        printProducts(products);

        double total = calculateTotalPrice(products);
        System.out.println("Total price of all products: $" + total);
    }

    // Метод для печати информации о продуктах
    public static void printProducts(Product[] products) {
        System.out.println("Product List: ");
        System.out.println("------------------------");
        for (Product product : products) {
            System.out.println(product.toString());
            System.out.println("------------------------");
        }
    }

    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
