package Tehtava4;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
//esto represonta al sujeto
public class WeatherStation implements Subject, Runnable {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private final float MIN_TEMP = -10.0f;
    private final float MAX_TEMP = 40.0f;
    private boolean running = true;

    public WeatherStation() {
        // Temperatura inicial aleatoria entre MIN y MAX (conbstructor)
        this.temperature = ThreadLocalRandom.current().nextFloat() * (MAX_TEMP - MIN_TEMP) + MIN_TEMP;
    }

    @Override
    public void run() {
        while (running) {
            // Simula cambio de temperatura: +/- 1 grado
            float change = ThreadLocalRandom.current().nextBoolean() ? 1.0f : -1.0f;
            temperature += change;

            // Limita la temperatura dentro del rango permitido
            if (temperature > MAX_TEMP) temperature = MAX_TEMP;
            if (temperature < MIN_TEMP) temperature = MIN_TEMP;

            //notifia a alos onbserbadores
            notifyObservers();

            // Espera aleatoria entre 1 y 5 segundos
            try {
                int delay = ThreadLocalRandom.current().nextInt(1000, 5001);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("WeatherStation interrupted");
            }
        }
    }

    public void stop() {
        running = false;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}
