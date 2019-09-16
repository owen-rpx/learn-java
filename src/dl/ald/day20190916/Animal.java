package dl.ald.day20190916;

public class Animal {
	public Animal(){
		System.out.println("动物类执行了");
		age = 20;
	}

	public int age = 10;
	public String name;

	public void eat() {
		System.out.println("年龄："+ this.age + " 动物具有吃东西的能力");
	}
}
