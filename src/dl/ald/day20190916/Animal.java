package dl.ald.day20190916;

public class Animal {
	public Animal(){
		System.out.println("动物类执行了");
	}
	@SuppressWarnings("unused")
	private int age;
	public String name;

	public void eat() {
		System.out.println("动物具有吃东西的能力");
	}
}
