package Tehtava14;
public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    public void buildProcessor() { computer.setProcessor("Intel Core i5"); }
    public void buildRAM() { computer.setRamSize(16); }
    public void buildHardDrive() { computer.setHardDrive("512GB SSD"); }
    public void buildGraphicsCard() { computer.setGraphicsCard("Intel UHD Graphics"); }
    public void buildOperatingSystem() { computer.setOperatingSystem("Windows 11 Home"); }
    public void buildAccessories() { computer.setAccessories("Wireless Keyboard, Ergonomic Mouse"); }

    public Computer getComputer() { return computer; }
}
