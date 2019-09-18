package dl.ald.day20190918;

import java.util.Arrays;

public class Army {
	public String id;
	public String attr;
	public double power;
	public String[] history;
	
	public Army(){
		
	}
	public Army(String id,String attr,double power) {
		this.id = id;
		this.attr = attr;
		this.power = power;
	}
	public int combat() {
		System.out.println("Ö´ÐÐ×÷Õ½");
		return 0;
	}

	@Override
	public String toString() {
		return "Army [id=" + id + ", attr=" + attr + ", power=" + power
				+ ", history=" + Arrays.toString(history) + "]";
	}
	
}
