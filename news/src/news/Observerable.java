package news;

public interface Observerable{
public void addObserver(Observer o);
public void notifyObserver();
public void removeObserver(Observer o);
}
