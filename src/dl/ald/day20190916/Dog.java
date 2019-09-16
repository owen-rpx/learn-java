package dl.ald.day20190916;

public class Dog extends Animal {
	public int age;
	public Dog() {
		System.out.println("狗类执行了");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat();
		this.age = 30;
		System.out.println("年龄：" + this.age + " 狗具有吃的能力");
	}

	public void method() {
		super.eat();
	}


	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
