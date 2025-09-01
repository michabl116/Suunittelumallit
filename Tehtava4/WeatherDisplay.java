package Tehtava4;

public class WeatherDisplay implements Observer{
    private  String name;
    public  WeatherDisplay(String name){
        this.name=name;
    }
    public void update(float temperature){
        System.out.printf("%s: Temperatura actual: %f\n",name,temperature);
    }
}
