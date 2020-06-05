import java .awt.*;
import java.awt.event.*;

class Demo1
{
	Frame mainFrame;
	Label header;
	Label status;
	Panel ControalPanel;

public Demo1 ()
{
	mainFrame=new Frame("Marvellous");
	mainFrame.setSize(500,500);
	mainFrame.setLayout(new GridLayout(3,1));
	mainFrame.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});

	status=new Label();
	status.setAlignment(Label.CENTER);
	header=new Label();
	header.setAlignment(Label.CENTER);
	status.setSize(350,100);
	
	ControalPanel=new Panel();
	ControalPanel.setLayout(new FlowLayout());

	mainFrame.add(header);
	mainFrame.add(ControalPanel);
	mainFrame.add(status);
	mainFrame.setVisible(true);
}


public static void main(String arg[])
{
	Demo1 obj=new Demo1();
	obj.Display();
}

private void Display()
{
	header.setText("Please select Batch");
	Button PPA=new Button("PPA");
	Button Angular=new Button("Angular");
	PPA.setActionCommand("PPA");
	Angular.setActionCommand("Angular");

	PPA.addActionListener(new Hello());
	Angular.addActionListener(new Hello());

	ControalPanel.add(PPA);
	ControalPanel.add(Angular);
	mainFrame.setVisible(true);
}


private class Hello implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		String command =e.getActionCommand();

		if(command.equals("PPA"))
		{
			status.setText("PPA BATCH SELECTED");
		}
		else if (command.equals("Angular"))
		{
			status.setText("Angular BATCH SELECTED");
		}
		
	}
  }
}




















