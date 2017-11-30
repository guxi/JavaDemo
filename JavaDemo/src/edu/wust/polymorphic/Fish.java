package edu.wust.polymorphic;

public class Fish extends biology {
public Fish() {
	this.setEnergy(1);
}
public  int happy() {
	return getEnergy().intValue();
}
}
