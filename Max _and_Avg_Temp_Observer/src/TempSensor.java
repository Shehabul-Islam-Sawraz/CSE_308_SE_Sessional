import java.util.ArrayList;
import java.util.List;

public class TempSensor {
    private final List<Observer> observerList = new ArrayList<Observer>();
    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyAllObservers();
    }

    public void addObserver(Observer o){
        observerList.add(o);
    }

    private void notifyAllObservers() {
        for(Observer observer:observerList){
            observer.update(temp);
        }
    }
}
