import java .awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainPage
{
	Frame mainFrame;
	Label Header;
	Label Status;
	Label Pass;
	Panel ControlPannel;
	TextField t1,t2;
	Button b1;
	JPanel P=new JPanel();
	Label name;
	//FileOutputStream outstream=null;
	String ValidExt[]={".txt",".c",".java",".cpp"};

	public MainPage()
	{
		mainFrame=new Frame("Marvellos Packer Unpacker");
		mainFrame.setBackground(Color.BLUE);
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		P.setBounds(1,20,400,80);
		P.setBackground(Color.white);

		name =new Label("Marvellous Packer Unpacker:Login");
		name.setForeground(Color.blue);
		name.setBounds(50,30,400,60);

		Status=new Label();
		Status.setAlignment(Label.CENTER);

		Header=new Label();
		//Header.setAlignment();
		Header.setForeground(Color.white);
		Header.setBounds(10,120,90,60);
		t1=new TextField("");
		t1.setBounds(120,130,200,30);  

		Pass=new Label();
		Pass.setForeground(Color.white);
		//Pass.setAlignment(Label.CENTER);
		Pass.setBounds(10,200,100,60);  
		
		t2=new TextField("");
		
		t2.setBounds(120,210,200,30);
		Button b1=new Button("SUBMIT");
		b1.setBounds(10,260,70,40);
		b1.setBackground(Color.white);
		ControlPannel=new Panel();
		ControlPannel.setLayout(new FlowLayout());
		
		Image icon = Toolkit.getDefaultToolkit().getImage("home.shraddha.Desktop.don.png");

		mainFrame.add(Header);
		mainFrame.add(ControlPannel);
		mainFrame.add(Status);
		mainFrame.add(Pass);
		mainFrame.add(t1);
		mainFrame.add(t2);
		mainFrame.add(b1);
		mainFrame.add(P);
		P.add(name);
		mainFrame.setIconImage(icon);  
		

		mainFrame.setLayout(null);  
		mainFrame.setVisible(true);
	}

	public static void main(String arg[])
	{
		MainPage obj=new MainPage();
		obj.Display();
	}

	private void Display()
	{
		Header.setText("Username");
		Pass.setText("Password");
		
		
		b1.setActionCommand("SUBMIT");
		    
		b1.addActionListener(new Hello());

		ControlPannel.add(b1);
		

		mainFrame.setVisible(true);
	}
	     
	 private class Hello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String value1=t1.getText();
			String value1=t2.getText();
			mainFrame.dispose();
			
			String Command=e.getActionCommand();
				   
			if(e.getSource()==SUBMIT)
			{
				if(Validate(value1,value2)==false)
				{
					t1.setText("");
					t2.setText("");
					JOptionPane.showMessageDialog(this, "Short username","Marvellous Packer Unpacker", JOptionPane.ERROR_MESSAGE);
				}
				if(value1.equals("MarvellousAdmin")&&value2.equals("MarvellousAdmin"))
				{
					PackPage p2=new PackPage(value1);
				this.setVisible(false);
				p2.Pack();
				p2.setVisible(true);
				p2.setSize(500, 500);
				}
					
			}
			
		}
	}
}



