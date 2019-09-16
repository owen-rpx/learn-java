package dl.ald.day20190916;

public class Dog extends Animal {
	public Dog() {
		System.out.println("狗类执行了");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat();
		this.age = 30;
		System.out.println("年龄："+ this.age + " 狗具有吃的能力");
	}

}
