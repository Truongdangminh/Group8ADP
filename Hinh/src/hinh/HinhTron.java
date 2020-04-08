package hinh;

import java.util.Scanner;

public class HinhTron 
{
	private double bankinh;
	public void setBankinh(double bb)
	{
		if(bb<=0)
			System.out.println(bb+ "is not negative");
		else
			bb=bankinh;
	}
	public double getBankinh()
	{
		return bankinh; 
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap ban kinh: ");
		setBankinh(kb.nextDouble());
	}
	public double dientich()
	{
		return (3.14 * bankinh*bankinh);
	}
	public double chuvi()
	{
		return bankinh*2*3.14;
	}
	public static void main(String[] args) 
	{
		HinhTron r1=new HinhTron();
		r1.bankinh=5;
		System.out.println(r1.dientich());
		System.out.println(r1.chuvi());
		HinhTron r2=new HinhTron();
		r2.bankinh=9;
		System.out.println(r2.dientich());
		System.out.println(r2.chuvi());
	}
}
