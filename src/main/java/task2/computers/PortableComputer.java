package task2.computers;

import task2.components.CPU;
import task2.components.HDD;
import task2.components.RAM;

abstract public class PortableComputer extends ComputerImpl {
    public PortableComputer(CPU cpu, HDD hdd, RAM ram) {
        super(cpu, hdd, ram);
    }
}
