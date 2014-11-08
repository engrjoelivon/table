package front_back_connector;
import java.util.ArrayList;


import backend.*;

public class Connector {
public Person person;
public static int count=1;
public Database database;
public Connector()
{
	database=new Database();	
}

public ArrayList<Person>  getData()
{
		
return database.getPeople();
}

public void addperson()
{
if(count==1)
{person =new Person(count,"joel", "omo", 27,"Engineer", 5.8);}
else if(count==2)
{person =new Person(count,"paul", "ramos", 27,"Scientist", 6.2);}
else if(count==3)
{person =new Person(count,"abi", "sola", 50,"Scientist", 5.2);}
System.out.println("i am in addperson" + person.getOccupation());
database.setPeople(person);
count++;
}

public void RemoveData() {
	database.getPeople().remove(database.getPeople().size()-1);
	
	
	
}
}
