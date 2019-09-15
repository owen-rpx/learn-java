package dl.ald.day20190913;
import java.util.Scanner;
/*
 * 功能：输入学生成绩并且当成绩小于60分时，自动加分到60；输出加分前成绩，加分后成绩，加分次数；
 * 
*/
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = input.nextInt();
		int count = 0;
		System.out.println("加分前成绩："+score);
		while(score<60) {
			count++;
			score++;
		}
		System.out.println("加分后成绩："+score);
		System.out.println("加分次数："+count);
		
	}

}
