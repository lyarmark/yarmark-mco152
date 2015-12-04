package yarmark.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketHttpRequestDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// give the socket host name and port
		Socket socket = new Socket("www.google.com", 80);

		// this is the request you send when you google 'google.com'
		// this is the http part of the url
		String httpRequestString = "GET /index.html\n\n";

		PrintWriter out = new PrintWriter(socket.getOutputStream());

		// REQUEST
		// write the stream from the socket to the socket
		out.write(httpRequestString);

		// MUST DO THIS
		out.flush();

		// RESPONSE
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String s;
		while ((s = in.readLine()) != null) {
			System.out.println(s);
		}

		socket.close();

	}
}
