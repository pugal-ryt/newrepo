package com;

interface Shape{
	
	void draw();
	
	  static void add(int a,int b) {
		 
		  System.out.println("Adding two numbers:"+(a+b));
		
	}
}

/*
class Rectancle implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Rectancle draw() Methed");
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Circle draw() Methed");
		
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Square draw() Methed");
		
	}
	
}

*/
public class Lambdaexample  {

	public static void main(String[] args) {
		
    
    print(()-> System.out.println("Class Rectancle draw() Methed"));
    print(()-> System.out.println("Class square draw() Methed"));
    print(()-> System.out.println("Class circle draw() Methed"));
    
	}
	
	private static void print(Shape shape) {
		shape.draw();
		Shape.add(10,20);
	}
}
