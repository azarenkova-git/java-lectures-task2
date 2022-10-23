package task2.components;

public class HDD extends Component {
    public double volume;
    public String type;

    public HDD(String manufacturer, double volume, String type) {
        super(manufacturer);
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "volume=" + volume +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
