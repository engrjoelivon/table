  The frontend defines the userInterface.The table class is constructed from the abstractModelTable class.The TableModel class extends the
abstractModelTable class and overides its abstract method.
  The tablepanel class contains a jtable that is used to create a table for the GUI.
 The constructor of the Jtable is defined to accept a class thats extends the abstract table modal.Extending the abstract table modal
  gives us the ability the set the number of columns,number of rows,names of every column and datas to be displayed in every column.
  The MainFrame is the controller class for the GUI it where all the connection between the different panels takes place.
Following the rule that the no two component should directly connect to one another the tablepanelconnector interface comes in,its function 
is to bridge the datas coming from the control.java to the table through the MainFrame class.
  I added a jpopupmenu to the TablePanel class.Jpopupmenu is very similar to jmenu.It is used to popup a menu when something is clicked or when a
component or mouse is clicked.When this happens its view method must be invoked.
To listen for mouse events i used the mouse adapter anonymous class,the mouselistener can also be appropriate,but it contains lots of unwanted method,with the adapter one can just override the desired method.
The mouse is predefined in java to have 3 buttons,so to use the right button use e.getButton()==MouseEvent.BUTTON3.