package frontend;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import backend.Person;

public class TableModel extends AbstractTableModel {
private	ArrayList<Person> arr;
private Person person;
private String [] columnNames={"Name","LastName","Age","Height","Occupation","Id"}; /*declares a name for every column for this to work the table must be passed into a JscrollPane*/

public TableModel()
{
	arr=new ArrayList<>();

}	


@Override
public String getColumnName(int column) /*Overrides this method to pass in the names of every column,from the columnNames array*/
{
	
	return columnNames[column];
}


@Override
	public int getRowCount() {
		
	return arr.size();
		
	}

	@Override
	public int getColumnCount()/*This is manually defined based on the number of fields contained in every object or number of informations intended to be displayed*/ {
		
		return 6;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		     person=arr.get(rowIndex);/*passes the row to the array so as to return object in that row*/
		int size=0;
	////Uses a fall through switch style to iterate through the entire column ///////
		switch(columnIndex)
		{
		case 0:{
			size++;
		return person.getName();
		}
		case 1:{
			size++;
		return person.getLastName();
		}
		case 2:{
			size++;
		return person.getAge();
		}
		case 3:{
			size++;
		return person.getHeight();}
		case 4:{
			size++;
		return person.getOccupation();}
		case 5:{
			size++;
		return person.getId();}   //the number of cases must be equal to the number of columns,which is 6 from the example.
		
		
		
		}
		
		return null;
	}
public void loadTable(ArrayList<Person> data)/*returns an arraylist from the tablepanel containing the object to be passed to the table*/
{
	
this.arr=data;
}
}
	


