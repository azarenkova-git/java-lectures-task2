package task2.computers;

import task2.components.*;

public class Netbook extends PortableComputer {
    public Display display;

    public Keyboard keyboard;

    public Netbook(CPU cpu, HDD hdd, RAM ram, Display display, Keyboard keyboard) {
        super(cpu, hdd, ram);
        this.display = display;
        this.keyboard = keyboard;

    }

    @Override
    public String toString() {
        return "Netbook{" +
                "display=" + display +
                ", keyboard=" + keyboard +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
