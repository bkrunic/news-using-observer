package news;

public class UserB extends User{

	public UserB(Observerable observable) {
		super(observable);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void action() {
	// TODO Auto-generated method stub
	System.out.println("Dislike");
}
}
