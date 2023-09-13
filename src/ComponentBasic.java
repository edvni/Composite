public class ComponentBasic implements ComputerComponent {
    private String name;
    private double price;

    public ComponentBasic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
