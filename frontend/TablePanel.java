package frontend;

import java.awt.Color;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import backend.Person;

public class TablePanel extends JPanel{
private JTable jTable;
private TableModel tbm;
private JPopupMenu popmenu;

public TablePanel()
{   
	
	
	
	
	
	
	
	
	tbm=new TableModel();
	jTable=new JTable(tbm);	
	setpopupmenu();
	
	new ArrayList<>(2);
	
    //loadTableModel();


	
 
setBackground(Color.BLACK);
add(new JScrollPane(jTable));//A jTable must be added to a JscrollPane

}

public void loadTableModel(ArrayList<Person> people)
{
		

tbm.loadTable(people);	
}
public void refresh(){
	
tbm.fireTableDataChanged();	
}
 //defining a jpopupmenu///
public void setpopupmenu()
{   
	popmenu=new JPopupMenu();
	//adding items to Jpopupmenu object//
	JMenuItem delete=new JMenuItem("Delete");
	delete.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int row=jTable.getSelectedRow();
			System.out.println(row);
			
		}
	});
	JMenu size=new JMenu("size");  size.setBackground(Color.BLACK); size.setForeground(Color.WHITE); 
	JMenuItem length=new JMenuItem("length");length.setForeground(Color.BLACK);
	JMenuItem breath=new JMenuItem("breath");
	JMenuItem heigth=new JMenuItem("height");
	size.add(heigth);
	size.add(breath);
	size.add(length);
	popmenu.add(delete);
    popmenu.add(size);
	jTable.addMouseListener(new MouseAdapter() {

		public void mousePressed(MouseEvent e) {
			//System.out.println(jTable.rowAtPoint(e.getPoint()));//getting row clicked on the table
			jTable.getSelectionModel().setSelectionInterval(jTable.rowAtPoint(e.getPoint()), jTable.rowAtPoint(e.getPoint()));
			if(e.getButton()==MouseEvent.BUTTON3)
			{
			
				
		popmenu.show(jTable, e.getX(), e.getY()); //for a jpopupmenu to become visible the,its show method must be invoked,the parameter passed in get the location it was clicked and displays it in the same position
			}
			
		}
		
	});


}



}
