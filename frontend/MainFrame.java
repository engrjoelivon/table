package frontend;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import backend.Person;

import front_back_connector.Connector;

public class MainFrame extends JFrame{
private TablePanel tablePanel;
private Control control;
private Connector connector;
ArrayList<Person> people;
public MainFrame()
 {  connector=new Connector();
	tablePanel=new TablePanel();
     control=new Control();
     control.tbcListener(new TablePanelConnector() {
		
		@Override
		public void connect(String add) {
			if(add.equals("add"))
			{
				System.out.println("Button clicked");
				 people=new ArrayList<Person>();
				connector.addperson();
				people=connector.getData();
				System.out.println("size is "+people.size());
				tablePanel.loadTableModel(people )  ;
				//tablePanel.loadTableModel(new Connector().getData());
				tablePanel.refresh();
				}
			else
			{
				
				connector.RemoveData();	
				tablePanel.refresh();
		
				
			}
			
		}
	});
     
     
     
     
    setLayout(new BorderLayout()) ;
    add(tablePanel, BorderLayout.CENTER);
    add(control, BorderLayout.NORTH);
	setLocation(550, 200);
	setMinimumSize(new Dimension(500, 500));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

}
public static void main(String []arg)
{
	new MainFrame();

}
}
