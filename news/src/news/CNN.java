package news;

import java.util.ArrayList;
import java.util.TimerTask;

public class CNN extends TimerTask implements Observerable {
private ArrayList<Observer> users=new ArrayList<Observer>();

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		users.add(o);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o:users) {
			o.update();
		}
	}

	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		users.remove(o);
	}
	
	//function that notifies observers about the news(can add reading from a file)
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("News is: Djokovic has lost");
		notifyObserver();
	
	}

	

}
