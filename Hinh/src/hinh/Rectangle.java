package hinh;

import java.util.Scanner;

public class Rectangle {
	protected double length, width;

	public Rectangle(){}

	public Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}

	public void setLength(double l) {
		if(l < 0) {
			length = 0;
		}
		else {
			length = l;
		}
	}

	public void setWidth(double w) {
		if(w <= 0) {
			System.out.println(w + " is not negative.");
		}
		else {
			width = w;
		}
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter length: ");
		setLength(kb.nextDouble());
		System.out.println("enter width: ");
		setWidth(kb.nextDouble());
	}
	
	public double calArea() {
		return length * width;
	}
	
	public double calCircumference() {
		if(length <= 0 || width <= 0) {
			return 0;
		}
		else {
			return (length + width) * 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void output() {
		// TODO Auto-generated method stub
		
	}

}
