The frontend defines the userInterface.The table class is constructed from the abstractModelTable class.The TableModel class extends the
abstractModelTable class and overides its abstract method.
The tablepanel class contains a jtable that is used to create a table for the GUI.
The MainFrame is the controller class for the GUI it where all the connection between the different panels takes place.
Following the rule that the no two component should directly connect to one another the tablepanelconnector interface comes in,its function 
is to bridge the datas coming from the control.java to the table through the MainFrame class.