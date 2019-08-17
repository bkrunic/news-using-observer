package news;
//just to make it smoother
public abstract class User implements Observer {
	private Observerable observable=null;

	public User(Observerable observable) {
	super();
	this.observable = observable;
}


	public void update() {
		// TODO Auto-generated method stub
		action();
	}

	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Like");
	}

}


