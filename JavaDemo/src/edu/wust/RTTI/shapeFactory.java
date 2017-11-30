package edu.wust.RTTI;

public class shapeFactory {
	public static Shape shapeCreator(int i){
		if (i==1)
		return new Circle();
		else if (i==2)
		return new Square();
		else return new Triangle();
	}
	
	public static Shape newShape(String sType){
		Shape s =null;
		try {
			//动态装载类
			Class<?> c = Class.forName(sType);
			s= (Shape)c.newInstance();						
			}catch (Exception e) {
			return null;
			}
		return s;
	}
}
