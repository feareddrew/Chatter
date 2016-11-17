import java.io.*;
import java.net.*;
import java.util.*;
public class ChatterClient {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int port = 4343;
		String host = "localhost";
		
		try {
		
				
				Socket connection = new Socket(host, port);
				System.out.println("Joining Server...");
				
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));	
				PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
				
				while(true) {
					
					System.out.println("Server: " + in.readLine());
					System.out.print("User: "); 
					out.println(cin.nextLine());
					
					}
				
			} catch (IOException e) { System.out.println(e); }
			
		} 
		
	}
