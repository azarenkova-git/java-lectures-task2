package task2;

import task2.components.*;
import task2.computers.*;

import java.io.IOException;
import java.util.Vector;

public class Main {
    public static CPU createCPU() {
        return new CPU("intel", 2, 1000);
    }

    public static HDD createHDD() {
        return new HDD("intel", 2000000, "ssd");
    }

    public static RAM createRAM() {
        return new RAM("intel", 2000000, 2000000);
    }

    public static Display createDisplay() {
        return new Display("samsung", "I900");
    }

    public static Keyboard createKeyboard() {
        return new Keyboard("samsung", "T1000");
    }

    public static VGA createVGA() {
        return new VGA("samsung", 2000000);
    }

    public static Laptop createLaptop() {
        return new Laptop(createCPU(), createHDD(), createRAM(), createDisplay(), createKeyboard());
    }

    public static Monoblock createMonoblock() {
        return new Monoblock(createCPU(), createHDD(), createRAM(), createDisplay());
    }

    public static Netbook createNetbook() {
        return new Netbook(createCPU(), createHDD(), createRAM(), createDisplay(), createKeyboard());
    }

    public static NetTop createNetTop() {
        return new NetTop(createCPU(), createHDD(), createRAM());
    }

    public static PC createPC() {
        return new PC(createCPU(), createHDD(), createRAM(), createVGA());
    }

    public static ServerComputer createServerComputer() {
        return new ServerComputer(createCPU(), createHDD(), createRAM());
    }

    public static Tablet createTablet() {
        return new Tablet(createCPU(), createHDD(), createRAM());
    }

    public static void main(String[] args) throws IOException {
        Vector<Computer> computers = new Vector<>();

        computers.add(createLaptop());
        computers.add(createMonoblock());
        computers.add(createNetbook());
        computers.add(createNetTop());
        computers.add(createPC());
        computers.add(createServerComputer());
        computers.add(createTablet());

        for (Computer computer : computers) {
            computer.turnOn();
            computer.turnOff();
            computer.connectToInternet();
            System.out.println();
        }
    }
}
