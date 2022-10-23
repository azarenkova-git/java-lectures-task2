package task2.computers;

import task2.components.CPU;
import task2.components.HDD;
import task2.components.RAM;
import task2.components.VGA;

public class PC extends DesktopComputer {
    public VGA vga;

    public PC(CPU cpu, HDD hdd, RAM ram, VGA vga) {
        super(cpu, hdd, ram);
        this.vga = vga;
    }

    @Override
    public String toString() {
        return "PC{" +
                "vga=" + vga +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
