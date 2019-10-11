package dl.ald.day20190925_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 载货车：
		// 重汽HOWO悍将载货车：
		// 公告型号： ZZ5047CCYG3315E143
		// 类型： 仓栅载货车
		// 额定载重： 1.56吨
		// 箱长级别： 4.2米
		// 车身长度： 5.995米
		// 车身高度： 3.37米
		// 租价： 800/天
		//
		// 一汽解放轻卡虎V载货车：
		// 公告型号： CA5049CCYP40K2L1E5A84
		// 类型： 仓栅载货车
		// 额定载重： 1.58吨
		// 箱长级别： 4.2米
		// 车身长度： 5.998米
		// 车身高度： 3.31米
		// 租价： 750/天
		//
		//
		// 载人车：
		// 五菱荣光微面：
		// 发动机：五菱LMU
		// 准乘人数： 8人
		// 车身长度： 4.4米
		// 车身高度： 1.77米
		// 租价： 500/天
		// 宝骏730：
		// 发动机：1.5L 直列4缸
		// 准乘人数： 7人
		// 车身长度： 4.7米
		// 车身高度： 1.76米
		// 租价： 550/天
		// 别克GL6：
		// 发动机：1.5L 直列4缸
		// 准乘人数： 5人
		// 车身长度： 4.6米
		// 车身高度： 1.79米
		// 租价： 650/天
		//
		// 皮卡车：
		// 长安神骐F30皮卡：
		// 公告型号： SC1025SPBB6
		// 额定载重： 0.495吨
		// 车身长度： 5.535米
		// 车身高度： 1.7米
		// 准乘人数： 5人
		// 租价： 600/天
		CargoVehicle ccar1 = new CargoVehicle("重汽HOWO悍将", "载货车", "仓栅载货车",
				"UNKOWN", 3.37, 5.995, 800);
		ccar1.setWeight(1.56);
		CargoVehicle ccar2 = new CargoVehicle("解放轻卡虎V", "载货车", "仓栅载货车",
				"UNKOWN", 3.31, 5.998, 750);
		ccar2.setWeight(1.58);

		PassengerVehicle pcar1 = new PassengerVehicle("五菱荣光微面", "载人车",
				"UNKOWN", "五菱LMU", 1.77, 4.4, 500);
		pcar1.setPassengers(8);
		PassengerVehicle pcar2 = new PassengerVehicle("宝骏730    ", "载人车",
				"UNKOWN", "1.5L 直列4缸", 1.76, 4.7, 550);
		pcar2.setPassengers(7);
		PassengerVehicle pcar3 = new PassengerVehicle("别克GL6    ", "载人车",
				"UNKOWN", "1.5L 直列4缸", 1.79, 4.6, 650);
		pcar3.setPassengers(5);

		PickupVehicle pkcar1 = new PickupVehicle("长安神骐F30", "皮卡车", "UNKOWN",
				"UNKOWN", 1.7, 5.535, 600);
		pkcar1.setPassengers(5);
		pkcar1.setWeight(0.495);

		// 进入系统
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到答答租车系统~");
		System.out.println("进行选车输入1，否则输入0.");
		int mark = -1;
		try {
			mark = input.nextInt();
			String markL = input.nextLine(); //https://blog.csdn.net/sinat_38301574/article/details/79588366
			switch (mark) {
			case 1:
				System.out.println("我们目前有以下车辆可出租：");
				System.out.println("序号\t用途 \t名称 \t\t价格\t\t描述");
				ccar1.print("1");
				ccar2.print("2");
				pcar1.print("3");
				pcar2.print("4");
				pcar3.print("5");
				pkcar1.print("6");

				System.out
						.println("_____________________________________________________________________");

				System.out.print("请输入租车的序号：");
				int no = input.nextInt();
				String noL = input.nextLine();
				System.out.print("请输入租车的天数：");
				int days = input.nextInt();
				String daysL = input.nextLine();

				// 生成租车订单
				String name = null;
				double amount = 0;
				switch (no) {
				case 1:
					name = ccar1.name;
					amount = ccar1.price * days;
					break;
				case 2:
					name = ccar2.name;
					amount = ccar2.price * days;
					break;
				case 3:
					name = pcar1.name;
					amount = pcar1.price * days;
					break;
				case 4:
					name = pcar2.name;
					amount = pcar2.price * days;
					break;
				case 5:
					name = pcar3.name;
					amount = pcar3.price * days;
					break;
				case 6:
					name = pkcar1.name;
					amount = pkcar1.price * days;
					break;
				}
				// 计算完成
				System.out.println();
				System.out.println("你好，租车订单如下：");
				System.out
						.println("-------------------------------------------------------------------");
				System.out.println("租车：" + name + "		租用：" + days + " 天	总费用："
						+ amount + " 元");
				System.out
						.println("-------------------------------------------------------------------");
				break;
			case 0:
				System.out.println("正常退出系统！");
				break;
			default:
				System.out.println("输入有误，系统退出！");
			}
		} catch (InputMismatchException e) {
			System.out.println("输入异常" + e.getMessage());

		} catch (Exception e) {
			System.out.println("系统出错" + e.getMessage());

		} finally {
			System.out.println();
			System.out.println();
			System.out.println("欢迎下次使用，再见！");
			System.out.println();
		}
	}

}
