package computer;

import computer.model.Computer;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer();
        comp1.setCpu("Intel");
        comp1.setRam(-16);
        comp1.setSsd(0);


        comp1.computerTurnOn();

        Computer comp2 = new Computer("i7", 16, 512, "Acer", "Off");
        System.out.println(comp2.toString());
    }
}
