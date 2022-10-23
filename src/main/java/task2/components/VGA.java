package task2.components;

public class VGA extends Component {
    public double memory;

    public VGA(String manufacturer, double memory) {
        super(manufacturer);
        this.memory = memory;

    }

    @Override
    public String toString() {
        return "VGA{" +
                "memory=" + memory +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
