public class HighEndComponentFactory implements ComponentFactory{
    public ComponentBasic createCPU() {
        return new ComponentBasic("High-end CPU", 450.0);
    }

    public ComponentBasic createRAM() {
        return new ComponentBasic("High-end RAM", 150.0);
    }

    public ComponentBasic createSSD() {
        return new ComponentBasic("High-end SSD", 175.0);
    }
    public CompositeComponent createMotherboard() {
        CompositeComponent motherboard = new CompositeComponent("Advanced Motherboard", 250.0);
        motherboard.addComponent(createCPU());
        motherboard.addComponent(createRAM());
        motherboard.addComponent(createSSD());
        return motherboard;
    }

    public CompositeComponent createComputerCase() {
        return new CompositeComponent("Premium Computer Case", 130.0);
    }
}
