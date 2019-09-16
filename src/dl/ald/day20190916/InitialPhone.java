package dl.ald.day20190916;

public class InitialPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("mi", 5.4, 128, 8);
		p1.call();
		System.out.println(p1);
		
		Phone p2 = new Phone("mi", 5.4, 128, 8);
		if(p1.equals(p2)) {
			System.out.println("Same phone!");
		}else {
			System.out.println("Diff phone!");
		}
	}

}
