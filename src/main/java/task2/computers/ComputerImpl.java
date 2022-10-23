package task2.computers;

import task2.components.CPU;
import task2.components.HDD;
import task2.components.RAM;


public abstract class ComputerImpl implements Computer {
    public CPU cpu;
    public HDD hdd;
    public RAM ram;

    public ComputerImpl(CPU cpu, HDD hdd, RAM ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Компьютер с характеристиками " + this + " включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер с характеристиками " + this + " выключен.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Компьютер с характеристиками " + this + " подключился к интернету.");
    }
}
