package edu.wust.polymorphic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Monday {

	public static void main(String[] args) {
		Person me=new Person();
		//备餐
		Fish[] breakfastfoods =new Fish[2];
		
		for(int i=0;i<2;i++)
		{
			breakfastfoods[i]=new Fish();
		}
		Fish[] lunchfoods =new Fish[3];
		
		for(int i=0;i<3;i++)
		{
			lunchfoods[i]=new Fish();
		}
		Fish[] dinnerfoods =new Fish[4];
		
		for(int i=0;i<4;i++)
		{
			dinnerfoods[i]=new Fish();
		}			
		
		me.breakfast(breakfastfoods)
			.read(4)
			.dinner(dinnerfoods)
			.read(4)
			.football(3)
			.lunch(lunchfoods)
			.read(4);

		
		System.out.println(me.happy());

	}

}
