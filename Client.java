import java.io.*;
import java.net.*;

class Client
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Client is Running...");

		Socket s=new Socket("localhost",2100);

		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps=new PrintStream(s.getOutputStream());

		String str1,str2;

		while(true)
		{
			System.out.println("Enter message for server");
			str1=brk.readLine();
			if(str1.equals("Exit"))
			{
				break;
			}
			ps.println(str1);
			str2=brs.readLine();
			System.out.println("Message from server:\n"+str2);
		}
	}
}
