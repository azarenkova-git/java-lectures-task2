package task2.components;

public class CPU extends Component {
    public long numberOfCores;
    public double frequency;

    public CPU(String manufacturer, long numberOfCores, double frequency) {
        super(manufacturer);
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
