package Tehtava4;
//esta e sla interfase sujeto
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
