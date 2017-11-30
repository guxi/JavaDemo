package edu.wust.polymorphic;

public class Person extends biology
{
	public Person() {
		setEnergy(30);
	}
	public String name;
	public void setName(String name) {
		this.name = name;	}

	private String sex;
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	} 
	
	Person breakfast(biology[] foods ) {
		for(biology food:foods) {
		eat((a)->a.getEnergy(),food);
		}
		activity((a)->a,1);
		return this;
	}	

	Person lunch(biology[] foods ) {
		for(biology food:foods) {
		eat((a)->a.getEnergy(),food);
		}
		activity((a)->a,2);
		return this;
	}
	Person dinner(biology[] foods ) {
		for(biology food:foods) {
			eat((a)->a.getEnergy(),food);
			}
			activity((a)->a,3);
			return this;
	}
	
	Person football(Integer time ) {		
		activity((a)->a,time);	
		return this;
	}
	Person read(Integer time ) {		
		activity((a)->a,time);	
		return this;
	}
	public  int happy() {
		return getEnergy().intValue();
	}
}
