package task2.computers;

import task2.components.*;

public class Laptop extends PortableComputer {
    public Display display;

    public Keyboard keyboard;

    public Laptop(CPU cpu, HDD hdd, RAM ram, Display display, Keyboard keyboard) {
        super(cpu, hdd, ram);
        this.display = display;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display=" + display +
                ", keyboard=" + keyboard +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
