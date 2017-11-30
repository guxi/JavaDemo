package edu.wust.collection;

import java.util.Arrays;
import java.util.List;

public class Fruit {
	Fruit(String name,int calories){
		setName(name);
		
		setCalories(calories);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	private String name;	
	private int calories;
	@Override
	public String toString() {
        return name;
    }	
	public static final List<Fruit> menu =
			Arrays.asList( 
				new Fruit("香蕉",  50),
				new Fruit("芒果",  55),
				new Fruit("苹果",  70),				
				new Fruit("大鸭梨", 40));
}
