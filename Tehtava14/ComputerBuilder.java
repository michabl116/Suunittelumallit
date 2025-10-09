package Tehtava14;

public interface ComputerBuilder {
    void buildProcessor();
    void buildRAM();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildOperatingSystem();
    void buildAccessories(); // opcional
    Computer getComputer();
}

