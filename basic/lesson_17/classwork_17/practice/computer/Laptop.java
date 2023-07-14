package practice.computer;

public class Laptop  extends Computer {
    public static void main(String[] args) {

    }
    public Laptop(String cpu, byte ram, int ssd, String brand, int size, int weight) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;
    }
    public void display(){
        super.display();
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
    }
    private int size;
    private int weight;
    private String color;



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    }
