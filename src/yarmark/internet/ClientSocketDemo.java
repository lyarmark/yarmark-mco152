package yarmark.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketDemo {
	// this is the client
	// client sends message and reads 1 line of response
	public static void main(String[] args) throws UnknownHostException, IOException {

		String serverIP = "192.168.117.150";

		// connect to server IP address
		// give a 5 digit number for port
		// anything below 1024 is reserved
		Socket socket = new Socket(serverIP, 52746);

		PrintWriter out = new PrintWriter(socket.getOutputStream());
		
		out.write("Hi\n");
		out.flush();
		
		InputStream in = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		String response = reader.readLine();
		
		System.out.println("RESPONSE");
		System.out.println(response);
		
		socket.close();

	}

}
