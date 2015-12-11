package yarmark.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

	public static void main(String[] args) throws IOException {

		// server reads 1 line of message and sends response

		// need to give port to serversocket
		// needs to be the same port as the client sends to
		ServerSocket serverSocket = new ServerSocket(52746);

		// waits for someone to call and accepts
		Socket socket = serverSocket.accept();

		InputStream in = socket.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		String response = reader.readLine();

		System.out.println("RESPONSE");
		System.out.println(response);

		PrintWriter out = new PrintWriter(socket.getOutputStream());

		out.write("How are you?\n");
		out.flush();

		serverSocket.close();
	}

}
