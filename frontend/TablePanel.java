package frontend;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import backend.Person;

public class TablePanel extends JPanel{
private JTable jTable;
private ArrayList<Person> arr;
private TableModel tbm;

public TablePanel()
{   
	tbm=new TableModel();
	arr=new ArrayList<>(2);
	
    //loadTableModel();


	
jTable=new JTable(tbm);	 
setBackground(Color.BLACK);
add(new JScrollPane(jTable));

}

public void loadTableModel(ArrayList<Person> people)
{
		

tbm.loadTable(people);	
}
public void refresh(){
	
tbm.fireTableDataChanged();	
}
}
