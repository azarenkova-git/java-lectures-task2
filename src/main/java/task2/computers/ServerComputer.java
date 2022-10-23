package task2.computers;

import task2.components.CPU;
import task2.components.HDD;
import task2.components.RAM;

public class ServerComputer extends ComputerImpl {
    public ServerComputer(CPU cpu, HDD hdd, RAM ram) {
        super(cpu, hdd, ram);
    }
}
