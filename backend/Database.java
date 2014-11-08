package backend;

import java.util.ArrayList;
import java.util.List;

public class Database {
public Person people;
public ArrayList<Person> peopleList;
public Database(){peopleList=new ArrayList<>();}
public void setPeople(Person person){
	
	peopleList.add(person);
	
}
public ArrayList<Person>  getPeople ()
{
	
return peopleList;
}
}
