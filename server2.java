import java.io.*;
import java.net.*;

public class server2{
		public static void main(String []args)throws IOException{
		ServerSocket s1=new ServerSocket(2345);
		while(true){
			Socket connectionsocket=s1.accept();
			BufferedrReader messagefromloadbalancer=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
			String sentence=messagefromloadbalancer.readLine();
			System.out.printIn("Received from Client: "+sentence);
			}
		}
}

