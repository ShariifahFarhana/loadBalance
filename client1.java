import java.io.*;
import java.net.*;

public class client1{
		public static void main(String []args)throws IOException{
		Socket myclient=new Socket("192.168.30.128",1234);
		DataOuputStream outtosocket=new DataOUtputStream
