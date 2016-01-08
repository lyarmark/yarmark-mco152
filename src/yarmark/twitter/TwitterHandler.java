package yarmark.twitter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class TwitterHandler extends AbstractHandler {

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// content type tells the browser what kind of file is being downloaded
		// as part of the http protocol
		response.setContentType("charset=utf-8");

		// status message tells browser what kind of response this will be
		// 200 is the 'OK' http code
		response.setStatus(HttpServletResponse.SC_OK);

		// need to tell the request that you've handled the message
		baseRequest.setHandled(true);

		// then print the response in html format

		response.getWriter().print("<h1>Hello World</h1<");

		// need url to connect to a server
		// to connect to the server on your local machine, put the port number
		// in the url
		// http://localhost:8080/
		// 8080 is the accepted port when running a server on your local machine
	}
}