package Tehtava4;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer display1 = new WeatherDisplay("Pantalla Norte");
        Observer display2 = new WeatherDisplay("Pantalla Sur");
        Observer display3 = new WeatherDisplay("Pantalla Este");

        station.addObserver(display1);
        station.addObserver(display2);
        station.addObserver(display3);

        Thread stationThread = new Thread(station);
        stationThread.start();

        // Simula por 15 segundos
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Elimina un observador
        System.out.println("\n--- Pantalla Sur ha sido eliminada ---\n");
        station.removeObserver(display2);

        // Simula otros 15 segundos
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detiene la estación
        station.stop();
        System.out.println("\nSimulación finalizada.");
    }
}
