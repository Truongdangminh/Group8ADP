package hinh;

import java.util.Scanner;

public class Triangle 
{
	
	private double a, b, c;
	
	public Triangle(){}
	
	public Triangle(double aa, double bb, double cc)
	{
		setA(aa);
		setB(bb);
		setC(cc);
	}
	
	public void setA(double aa)
	{
		if(aa <= 0)
		{
			System.out.println(aa + " is not negative");
		}
		else
		{
			a = aa;
		}
	}
	
	public void setB(double bb)
	{
		if(bb <= 0)
		{
			System.out.println(bb + " is not negative");
		}
		else
		{
			b = bb;
		}
	}
	
	public void setC(double cc)
	{
		if(cc <= 0)
		{
			System.out.println(cc + " is not negative");
		}
		else
		{
			c = cc;
		}
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	//circumference = perimeter
	public double calCircumference() 
	{
		if(a + b > c && a + c > b && b + c > a)
		{
			return a + b + c;
		}
		else
		{
			return 0;
		}
	}
	
	public double calArea()
	{
		if(a + b > c && a + c > b && b + c > a)
		{
		double p = calCircumference() / 2; 
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
		else
		{
			return 0;
		}
	}
	
	public void type()
	{
		if(a + b > c && a + c > b && b + c > a)
		{
			if(a == b && b == c)
			{
				System.out.println("Tam giac deu");
			}
			else if(a == b || a == c || b == c)
			{
				if(a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
				{
					System.out.println("Tam giac vuong can");
				}
				else
				{
				System.out.println("Tam giac can");
				}
			}
			else if(a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) 
			{
				System.out.println("Tam giac vuong");
			}
			else
			{
				System.out.println("Tam giac thuong");
			}
		}
		else
		{
			System.out.println("Khong phai tam giac");
		}
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a: ");
		setA(kb.nextDouble());
		System.out.println("enter b: ");
		setB(kb.nextDouble());
		System.out.println("enter c: ");
		setC(kb.nextDouble());
	}

	public static void main(String[] args) 
	{
		
		Triangle t1 = new Triangle(-3,6,7);
		t1.type();
		System.out.print("Dien tich 1 = ");
		System.out.println(t1.calArea());
		System.out.print("Chu vi 1 = ");
		System.out.println(t1.calCircumference());
		
		
		Triangle t2 = new Triangle(-3,-2,-1);
		t2.type();
		System.out.print("Dien tich 2 = ");
		System.out.println(t2.calArea());
		System.out.print("Chu vi 2 = ");
		System.out.println(t2.calCircumference());
		
		Triangle t3 = new Triangle(2,2,2);
		t3.type();
		System.out.print("Dien tich 2 = ");
		System.out.println(t3.calArea());
		System.out.print("Chu vi 2 = ");
		System.out.println(t3.calCircumference());
		
		Triangle t4 = new Triangle(3,4,5);
		t4.type();
		System.out.print("Dien tich 2 = ");
		System.out.println(t4.calArea());
		System.out.print("Chu vi 2 = ");
		System.out.println(t4.calCircumference());
		
	}

}
