package day2;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		 System.out.println("����� �̸��� " + name + "�Դϴ�.");
		 String city = sc.next();
		 System.out.println("����� ��� ���ô� " + city + "�Դϴ�");
		 int age = sc.nextInt();
		 System.out.println("����� ���̴� " + age + "���Դϴ�.");
		 double weight = sc.nextDouble();
		 System.out.println("����� ü���� " + weight + "kg�Դϴ�.");
		 boolean single = sc.nextBoolean();
		 System.out.println("����� ���� ���δ� " + single + "�Դϴ�.");
		 
		 sc.close();
		 
	}
}


