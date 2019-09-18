package dl.ald.day20190918;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army();
		System.out.println(a);
		
		Army a2 = new Army("A0001","执行抗日",120.6);
		System.out.println(a2);
		
		Army a3 = new Navy();
		System.out.println(a3);
		
		if(a3 instanceof LandForce) {
			a3.combat();
		}else{
			System.out.println("当前不是LandForce实例，不允许转换！");
		}
		
		if(a3 instanceof AirForce) {
			AirForce a4 = (AirForce)a3;
			a4.combat();
		}else{
			System.out.println("当前不是AirForce实例，不允许转换！");
		}
		
		
	}

}
