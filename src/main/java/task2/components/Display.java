package task2.components;

public class Display extends Component {
    public String model;

    public Display(String manufacturer, String model) {
        super(manufacturer);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Display{" +
                "model='" + model +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
