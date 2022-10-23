package task2.components;

public class RAM extends Component {
    public double memory;
    public double frequency;

    public RAM(String manufacturer, double memory, double frequency) {
        super(manufacturer);
        this.memory = memory;
        this.frequency = frequency;

    }

    @Override
    public String toString() {
        return "RAM{" +
                "memory=" + memory +
                ", frequency=" + frequency +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
