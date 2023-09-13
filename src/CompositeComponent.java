import java.util.ArrayList;
import java.util.List;

// Composite class representing a combination of components (Motherboard etc)
public class CompositeComponent implements ComputerComponent {
    private double price;
    private String name;
    private List<ComputerComponent> components = new ArrayList<>();

    // constructor
    public CompositeComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // function to add a component to motherboard
    public void addComponent(ComputerComponent component) {
        components.add(component);
    }

    // function to get total price of components in motherboard
    public double getPrice() {
        double totalPrice = price;
        for (ComputerComponent component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}
