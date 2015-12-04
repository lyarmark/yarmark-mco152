package yarmark.internet;

public class Notes {
/*
 * internet was originally created for military purposes
 * during the cold war, there was a fear of losing a physical phone call connection due to attack
 * so they wanted redundant connections.
 * 
 * sending something over the internet:
 * is actually broken into packages
 * like a long text message is broken automatically
 * 
 * then, if you don't get part of the file, you only have to request 1 or a few packets
 * 
 * TCP/IP:
 * transmission control protocol/internet protocol
 * 
 * Internet Protocol:
 * all computers on internet have an IP address associated with it.
 * 
 * format: |0-255|.|0-255|.|0-255|.|0-255| in IPversion4
 * 255 is 1 byte/8 bits
 * so an IP address is 4 bytes
 * BUT there are only 4 billion addresses this way
 * 
 * a wired connection in touro will have an IP address like
 * 192.168.117.*
 * 
 * a wifi connection will have an IP address like
 * 10.16.*.*
 * 
 * WorldWideWeb is the part of the Internet that can be accessed with a browser
 * A browser/client connects to a server
 * 
 * classical way web works: request/response
 * client sends a request to a server, and the server sends you a response
 * not everything works this way.
 * ex: chatting over Internet- you can send a 'response' to someone without them requesting anything
 * 
 * URL: universal resource locator
 * location of a piece of data
 * usually starts with http://[HOST]/[RESOURCE_NAME]
 * http: is a scheme. Hypertext Transfer Protocol 
 * a scheme tells the browser what protocol to use.
 * [protocol- ex: extending your hand means i want to shake hands, and the other person knows how to respond]
 * Resource name- which 'file' your looking for
 * leaving out the resource name sends you to index.html, or the home page.
 * 
 * DNS- domain name service
 * looks up and connects to the host name you're requesting.
 * EX: in command line
 * nslookup touro.edu (or any domain name)
 * this returns the IP address associated with this host name.
 * 
 * Think of each server on the Internet as an apt. building
 * the numbers in the IP address are distributed geographically
 * web sites know where you are via your IP address, and display appropriate ads, etc.
 * IP address: apt. building
 * now need to know apt. #
 * 
 * HTTP denotes protocol and port number
 * each server is a different port number. you need to know this port number to connect to it.
 * HTTP is associated with port 80 default
 * server sets up a socket on their machine
 * 
 * Java Docs: "A socket is an endpoint for communication between two machines."
 * this word comes from the old way phones work. an operator physically plugged in a socket to connect two phones
 * see SocketHttpRequestDemo
 * sockets have no protocol associate with them
 * socket request needs: host name and port
 * 
 * communicating over the web does not use sockets
 * see HttpURLConenctionDemo
 * an HttpURLConnection constructor takes in a URL, including 'http'
 * not a string because a string can be anything.
 * 
 * 
 * HOMEWORK
 * bring in your IP address
 * display current weather in GUI
 * description
 * temperature in farenheit (imperial)
 * by zipcode, which you can change 
 * with appropriate picture (icon)
 * from http://openweathermap.org/
 * inspect element picture
 * 
 * this will give you a JSON file to download and  work with
 * 
 * test 12/17
 * like this homework
 * JSON either given or online resource
 * Swing- to display JSON data
 * uses of http connection
 * maybe threads
 */
}
