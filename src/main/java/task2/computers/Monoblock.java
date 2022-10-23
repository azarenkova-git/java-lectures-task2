package task2.computers;

import task2.components.CPU;
import task2.components.Display;
import task2.components.HDD;
import task2.components.RAM;

public class Monoblock extends DesktopComputer {
    public Display display;

    public Monoblock(CPU cpu, HDD hdd, RAM ram, Display display) {
        super(cpu, hdd, ram);
        this.display = display;
    }

    @Override
    public String toString() {
        return "Monoblock{" +
                "display=" + display +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
