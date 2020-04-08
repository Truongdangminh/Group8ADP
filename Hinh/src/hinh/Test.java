package hinh;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("enter 1: Circle");
			System.out.println("enter 2: Triangle");
			System.out.println("enter 3: Rectangle");
			System.out.println("enter 4: Exit");
			System.out.print("Nhap chon: ");
			int choose = kb.nextInt();
			while(choose > 4) {
				System.out.println("Nhap sai, moi nhap lai: ");
				choose = kb.nextInt();
			}
			if(choose == 1)
			{
				HinhTron s = new HinhTron(); 
				s.input();
				System.out.println("Area= " + s.dientich());
				System.out.println("Cỉcumference= " + s.chuvi());
			}
			else if(choose == 2) {
				Triangle s = new Triangle();
				s.input();
				System.out.println("Area= " + s.calArea());
				System.out.println("Cỉcumference= " + s.calCircumference());
			}
			else if(choose == 3) {
				Rectangle s = new Rectangle();
				s.input();
				System.out.println("Area= " + s.calArea());
				System.out.println("Cỉcumference= " + s.calCircumference());
			}
			else if(choose == 4) {
				System.out.println("Exit");
				break;
			}
		}

	}

}
