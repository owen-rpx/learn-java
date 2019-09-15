package dl.ald.day20190913;
import java.util.Scanner;

/*
 * 功能：实现接受三个班级各四名学员的成绩信息，然后计算每个班级学员成绩的平均分；
 * 
*/

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i=1; i<4;i++) {
			System.out.println("请输入班级"+i+"的成绩信息：");
			
			for(int j=1;j<5;j++) {
				System.out.print("请输入班级"+i+"中，学生"+j+"的分数：");
				
				sum+=input.nextInt();
			}
			System.out.println("班级"+i+"的总分，平均分："+(sum/4));
			sum = 0;
		}
	}

}
