package news;

import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CNN cnn = new CNN();
		User userA = new UserA(cnn);
		User userB = new UserB(cnn);
		User userC = new UserC(cnn);
		//adding observers
		cnn.addObserver(userA);
		cnn.addObserver(userB);
		cnn.addObserver(userC);
//timer that writes news each 5 seconds
		Timer timer = new Timer();
		timer.schedule(cnn, 0, 5000);

	}

}
