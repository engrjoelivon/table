package backend;

public class Person {
private String name, lastName,occupation;
private int Age,id;
private Double height;
	
public Person(int id,String name,String LastName,int Age,String occupation,Double height)
{
this.setAge(Age);
this.setHeight(height);
this.setLastName(LastName);
this.setName(name);
this.setOccupation(occupation);
this.setId(id);

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public Double getHeight() {
	return height;
}

public void setHeight(Double height) {
	this.height = height;
}

public String getOccupation() {
	
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
