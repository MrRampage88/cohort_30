public class Pet {
    private String type;
    private double weight;
    private String livingConditions;

    // Конструктор для инициализации всех полей
    public Pet(String type, double weight, String livingConditions) {
        this.type = type;
        this.weight = weight;
        this.livingConditions = livingConditions;
    }

    // Геттеры и сеттеры для полей

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }

    // Метод для вывода информации о животном
    public void display() {
        System.out.println("Тип: " + type);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Условия проживания: " + livingConditions);
        System.out.println();
    }
}
