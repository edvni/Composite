public class LowEndComponentFactory implements ComponentFactory{
    public ComponentBasic createCPU() {
        return new ComponentBasic("Low-end CPU", 100.0);
    }

    public ComponentBasic createRAM() {
        return new ComponentBasic("Low-end RAM", 50.0);
    }

    public ComponentBasic createSSD() {
        return new ComponentBasic("Low-end SSD", 75.0);
    }
    public CompositeComponent createMotherboard() {
        CompositeComponent motherboard = new CompositeComponent("Basic Motherboard", 50.0);
        motherboard.addComponent(createCPU());
        motherboard.addComponent(createRAM());
        motherboard.addComponent(createSSD());
        return motherboard;
    }

    public CompositeComponent createComputerCase() {
        return new CompositeComponent("Basic Computer Case", 30.0);
    }
}
