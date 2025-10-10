package Tehtava14;


public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    public void buildProcessor() { computer.setProcessor("Intel Core i9"); }
    public void buildRAM() { computer.setRamSize(32); }
    public void buildHardDrive() { computer.setHardDrive("1TB NVMe SSD"); }
    public void buildGraphicsCard() { computer.setGraphicsCard("NVIDIA RTX 4090"); }
    public void buildOperatingSystem() { computer.setOperatingSystem("Windows 11 Pro"); }
    public void buildAccessories() { computer.setAccessories("RGB Keyboard, Gaming Mouse, Liquid Cooling"); }

    public Computer getComputer() { return computer; }
}
