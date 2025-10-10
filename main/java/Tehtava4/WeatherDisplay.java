package Tehtava4;

public class WeatherDisplay implements Observer{
    private  String name;
    public  WeatherDisplay(String name){
        this.name=name;
    }
    public void update(float temperature){
        //temperatura actual
        System.out.printf("%s: Current temperature : %.1f°C%n",name,temperature);
    }
}
