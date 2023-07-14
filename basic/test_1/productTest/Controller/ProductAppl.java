package productTest.Controller;

import productTest.Model.Food.Food;
import productTest.Model.Food.MeatFood;
import productTest.Model.Food.MilkFood;
import productTest.Model.Product;

class ProductsAppl {
    public static void main(String[] args) {
        // Создаем объекты для каждого продукта
        Product product = new Product(10.99, "Product 1", 123456789);
        Food food = new Food(5.99, "Food 1", 987654321, false);
        MeatFood meatFood = new MeatFood(8.99, "Meat Food 1", 456789123, true, "Beef");
        MilkFood milkFood = new MilkFood(3.99, "Milk Food 1", 789123456, false, "Cow's Milk", 2.5);

        // Создаем массив и добавляем все продукты в него
        Product[] products = {product, food, meatFood, milkFood};

        // Печатаем все продукты из массива
        printProducts(products);

        // Выводим сумму цен всех продуктов в магазине
        double total = calculateTotalPrice(products);
        System.out.println("Сумма цен всех продуктов: " + total);
    }

    // Метод для печати всех продуктов из массива
    public static void printProducts(Product[] products) {
        System.out.println("Все продукты в магазине:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Метод для вычисления суммы цен всех продуктов
    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
