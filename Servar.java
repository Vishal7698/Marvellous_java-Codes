import java.io.*;
import java.net.*;

class Servar
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Servar is Running...");
		ServerSocket ss=new ServerSocket(2100);
		Socket s=ss.accept();

		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps=new PrintStream(s.getOutputStream());
		
		String str1,str2;

		while(true)
		{
			str1=brs.readLine();
			if(str1==null)
			{
				break;
			}
			System.out.println("Message from client:\n"+str1);
			System.out.println("Enter message for client:");
			str2=brk.readLine();
			ps.println(str2);
		}
	}
}
