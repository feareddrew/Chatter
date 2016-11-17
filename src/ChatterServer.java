import java.io.*;
import java.net.*;
import java.util.*;

public class ChatterServer {

	public static void main(String[] args) {

		int port = 4343;
		String msg = "";
		
		try {
			
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server Succesfully Started");
			System.out.println("Bound To Port: " + port);
			System.out.println("Server Start Complete"); 
			
			while(true) {
			Socket client = server.accept();
			System.out.println("A Client Has Connected!");
			
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			out.println("Welcome To The Server");
			
			try {
				while(true){
				
					BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
					msg = in.readLine();
					out.println(msg);
					System.out.println("Client: " + msg);
				
					}
				} catch (SocketException e) { System.out.println("Client Disconnected"); }
			}	
			
		} catch (IOException e) { System.out.println(e); }
		
	} 

}
