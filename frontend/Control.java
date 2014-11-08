package frontend;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Control extends JPanel {
JButton jbutton;
JButton jbutton2;
private TablePanelConnector tbc;
	
public Control()
{
jbutton=new JButton("Add person");
jbutton2=new JButton("Subtract person");
jbutton.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
	   if(tbc!=null)
	   {
		   
		tbc.connect("add");   
	   }
		
	}
});
jbutton2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tbc.connect("minus");  
		
	}
});

setLayout(new FlowLayout());

add(jbutton);
add(jbutton2);

}

public void tbcListener(TablePanelConnector tbc)
{
	
this.tbc=tbc;
}
}

