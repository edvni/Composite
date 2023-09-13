import java.awt.*;

public class ComputerExample {
    public static void main(String[] args) {
        // create basic components
        ComputerComponent cpu = new ComponentBasic("CPU", 300.0);
        ComputerComponent ram = new ComponentBasic("RAM", 100.0);
        ComputerComponent ssd = new ComponentBasic("SSD", 150.0);
        ComputerComponent gpu = new ComponentBasic("GPU", 1500.0);

        //create composite component (motherboard)
        CompositeComponent motherboard = new CompositeComponent("Motherboard", 250.0);
        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);
        motherboard.addComponent(ssd);
        motherboard.addComponent(gpu);

        // create composite component (case)
        CompositeComponent computer = new CompositeComponent("Computer", 150.0);

        // create more components and add components to case
        ComputerComponent cooler = new ComponentBasic("Cooler", 100.0);
        ComputerComponent psu = new ComponentBasic("PSU", 90.0);
        computer.addComponent(motherboard);
        computer.addComponent(cooler);
        computer.addComponent(psu);

        // calculate total price of set up
        double totalPrice = computer.getPrice();
        System.out.println("Total price of custom built computer: €" + totalPrice);
        System.out.println("----------------------BONUS---------------------------");

        // BONUS BONUS BONUS BONUS BONUS BONUS BONUS BONUS BONUS BONUS BONUS
        // create a low-end computer using the LowEndComponentFactory
        ComponentFactory lowEndFactory = new LowEndComponentFactory();
        CompositeComponent lowEndComputer = lowEndFactory.createComputerCase();
        lowEndComputer.addComponent(lowEndFactory.createMotherboard());

        // calculate total price of low-end computer
        double lowEndPrice = lowEndComputer.getPrice();
        System.out.println("Pre-built Low-end computer price: $" + lowEndPrice);

        // create a high-end computer using the HighEndComponentFactory
        ComponentFactory highEndFactory = new HighEndComponentFactory();
        CompositeComponent highEndComputer = highEndFactory.createComputerCase();
        highEndComputer.addComponent(highEndFactory.createMotherboard());

        //calculate total price of high-end computer
        double highEndPrice = highEndComputer.getPrice();
        System.out.println("Pre-built High-end computer price: $" + highEndPrice);
    }
}
