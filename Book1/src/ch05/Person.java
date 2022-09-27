package ch05;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String name) {
		name = name;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
