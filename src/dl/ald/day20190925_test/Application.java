package dl.ald.day20190925_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ػ�����
		// ����HOWO�����ػ�����
		// �����ͺţ� ZZ5047CCYG3315E143
		// ���ͣ� ��դ�ػ���
		// ����أ� 1.56��
		// �䳤���� 4.2��
		// �������ȣ� 5.995��
		// �����߶ȣ� 3.37��
		// ��ۣ� 800/��
		//
		// һ������Ῠ��V�ػ�����
		// �����ͺţ� CA5049CCYP40K2L1E5A84
		// ���ͣ� ��դ�ػ���
		// ����أ� 1.58��
		// �䳤���� 4.2��
		// �������ȣ� 5.998��
		// �����߶ȣ� 3.31��
		// ��ۣ� 750/��
		//
		//
		// ���˳���
		// �����ٹ�΢�棺
		// ������������LMU
		// ׼�������� 8��
		// �������ȣ� 4.4��
		// �����߶ȣ� 1.77��
		// ��ۣ� 500/��
		// ����730��
		// ��������1.5L ֱ��4��
		// ׼�������� 7��
		// �������ȣ� 4.7��
		// �����߶ȣ� 1.76��
		// ��ۣ� 550/��
		// ���GL6��
		// ��������1.5L ֱ��4��
		// ׼�������� 5��
		// �������ȣ� 4.6��
		// �����߶ȣ� 1.79��
		// ��ۣ� 650/��
		//
		// Ƥ������
		// ��������F30Ƥ����
		// �����ͺţ� SC1025SPBB6
		// ����أ� 0.495��
		// �������ȣ� 5.535��
		// �����߶ȣ� 1.7��
		// ׼�������� 5��
		// ��ۣ� 600/��
		CargoVehicle ccar1 = new CargoVehicle("����HOWO����", "�ػ���", "��դ�ػ���", "UNKOWN", 3.37, 5.995, 800);
		ccar1.setWeight(1.56);
		CargoVehicle ccar2 = new CargoVehicle("һ������Ῠ��V", "�ػ���", "��դ�ػ���", "UNKOWN", 3.31, 5.998, 750);
		ccar2.setWeight(1.58);

		PassengerVehicle pcar1 = new PassengerVehicle("�����ٹ�΢��", "���˳�", "UNKOWN", "����LMU", 1.77, 4.4, 500);
		pcar1.setPassengers(8);
		PassengerVehicle pcar2 = new PassengerVehicle("����730", "���˳�", "UNKOWN", "1.5L ֱ��4��", 1.76, 4.7, 550);
		pcar1.setPassengers(7);
		PassengerVehicle pcar3 = new PassengerVehicle("���GL6", "���˳�", "UNKOWN", "1.5L ֱ��4��", 1.79, 4.6, 650);
		pcar1.setPassengers(5);

		PickupVehicle pkcar1 = new PickupVehicle("��������F30", "Ƥ����", "UNKOWN", "UNKOWN", 1.7, 5.535, 600);
		pkcar1.setPassengers(5);
		pkcar1.setWeight(0.495);

		// ����ϵͳ
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ��������⳵ϵͳ~");
		System.out.println("����ѡ������1����������0.");
		int mark = -1;
		try {
			mark = input.nextInt();

			switch (mark) {
			case 1:
				System.out.println("����Ŀǰ�����³����ɳ��⣺");
				System.out.println(
						"���                            ��;                              ����                        �۸�                                         ����1");
				break;
			case 0:
				System.out.println("��ӭ�´�ʹ�ã��ټ���");
				break;
			default:
				System.out.println("��������ϵͳ�˳���");
			}
		} catch (InputMismatchException e) {
			System.out.println("ϵͳ����" + e.getMessage());
		}
	}

}