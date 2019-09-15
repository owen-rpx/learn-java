package dl.ald.day20190914;
import java.time.LocalDate;
import java.util.Arrays;

public class Movie {
	String name;
	String type;
	String[] actors;
	float duriation;
	LocalDate  show;
	static int MD = 1;
	
	public Movie() {
		
	}
	public Movie(String _name,String _type, String[] _actors,float _duriation, LocalDate  _show) {
		name = _name;
		type = _type;
		actors = _actors;
		duriation = _duriation;
		show = _show;
	}

	void print() {
		System.out.println("电影信息");
		System.out.println("名字："+name);
		System.out.println("类型："+type);
		System.out.println("主演："+Arrays.toString(actors));
		System.out.println("片长："+duriation+"分钟");
		System.out.println("时间："+show);
		System.out.println("视频："+MD);
	}
	
	void doShow(String loc,int num) {
		System.out.println("-------------------------------------");
		print();
		System.out.println("上映地区："+loc);
		System.out.println("上映场次："+num+"场");
		System.out.println("-------------------------------------");
	}
}
