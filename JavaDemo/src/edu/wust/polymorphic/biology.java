package edu.wust.polymorphic;

import java.util.function.Function;


public  abstract class  biology {
	private Integer energy=0;
	public void setEnergy(Integer i) {
		this.energy=i;
	}
	public Integer getEnergy() {
		return this.energy;
	}
	 void eat(Function<biology,Integer> f,biology b) {
			 setEnergy(getEnergy() + f.apply(b));}

	 void activity(Function<Integer,Integer> f,Integer i) {
		 setEnergy(getEnergy() + f.apply(i));
	 }
	 public abstract int happy() ;
}
