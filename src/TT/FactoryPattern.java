package TT;

import java.util.Scanner;

interface Shape{
	public void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square implements Shape{
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class Triangle implements Shape{
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType == null)	return null;
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		if(shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		ShapeFactory sf = new ShapeFactory();	
		
		Shape s = sf.getShape(x);	
		s.draw();
		
		sc.close();
	}
}
