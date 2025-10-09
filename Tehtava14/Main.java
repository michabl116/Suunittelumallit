package Tehtava14;


public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        Computer gamingPC = director1.constructComputer();
        System.out.println("🎮 Gaming PC:\n" + gamingPC);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        Computer officePC = director2.constructComputer();
        System.out.println("💼 Office PC:\n" + officePC);
    }
}
