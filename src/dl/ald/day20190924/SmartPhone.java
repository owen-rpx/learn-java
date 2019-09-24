package dl.ald.day20190924;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone call.");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone send message.");
	}

	@Override
	public void palyGame() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone can play game.");
	}

}
