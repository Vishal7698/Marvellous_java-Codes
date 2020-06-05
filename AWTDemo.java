import java .awt.*;
import java.awt.event.*;

class AWTDemo
{
	Frame mainFrame;
	Label Header;
	Label Status;
	Panel ControlPannel;

	public AWTDemo()
	{
		mainFrame=new Frame("Marvellos");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		Status=new Label();
		Status.setAlignment(Label.CENTER);
		Header=new Label();
		Header.setAlignment(Label.CENTER);
		Status.setSize(350,100);
	
		ControlPannel=new Panel();
		ControlPannel.setLayout(new FlowLayout());

		mainFrame.add(Header);
		mainFrame.add(ControlPannel);
		mainFrame.add(Status);
			  
		mainFrame.setVisible(true);
	}

	public static void main(String arg[])
	{
		AWTDemo obj=new AWTDemo();
		obj.Display();
	}

	private void Display()
	{
		Header.setText("please select batch");
		
		Button PPA=new Button("PPA");
		Button Anguler=new Button("Anguler");

		PPA.setActionCommand("PPA");
		Anguler.setActionCommand("Anguler");
		    
		PPA.addActionListener(new Hello());
		Anguler.addActionListener(new Hello());

		ControlPannel.add(PPA);
		ControlPannel.add(Anguler);

		mainFrame.setVisible(true);
	}
	     
	 private class Hello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String Command=e.getActionCommand();
				   
			if(Command.equals("PPA"))
			{
				Status.setText("PPA batch is selected");
			}
			else if(Command.equals("Anguler"))
			{
				Status.setText("Angular batch is selected");
			}
		}
	}
}
