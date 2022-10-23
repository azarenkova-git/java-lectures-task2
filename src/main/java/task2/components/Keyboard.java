package task2.components;

public class Keyboard extends Component {
    public String model;

    public Keyboard(String manufacturer, String model) {
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
