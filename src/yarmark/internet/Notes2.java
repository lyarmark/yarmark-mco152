package yarmark.internet;

public class Notes2 {
/*
 * NAT- network address translation
 * allows the router to act as one computer
 * 
 * so one house/college will get one IP
 * pay for 1 address. i router will allow all computers to access internet
 * therefore, IPv4 allows more than 4 billion people
 * limited amout of 'address space'
 * 
 * who assigns them?
 * IANA
 * organization keeps track of IP addresses
 * static IP address don't usually change
 * 
 * how many unused are left?
none from v4

DHCP- dynamic host 
router is in charge of giving out IP address.
it can only work on devices in the network

192.168- network reserved for internal use

IP address should be unique. 2 people on different internal networks can have the same IP address

ipconfig tells you your IP address
ping 'talks' to IP address/URLs
	ex: ping google.com
nslookup can give you the IP address of a URL
	ex: nslookup google.com
tracert shows the computers that your message will get set to on the way to the IP/URL you gave, excluding your computer
	ex: tracert google.com

when you trace, the request will time out if the server doesn't want to identify itself

netstat- allows to you view the connections your computer currently has/waiting on
	ex: open tabs
	holds: TCP- connection type
		IP address and port
		host name:port
80 is not listed as a port. it lists http because that's the host for 80.
https is a different port.

referring to yourself:
1.	IP address
2.	127.0.0.1 = loop back IP address
3.	"localhost"

dns system needs to be very secure so no one can steal IP addresses

in 2008, someone discovered that he can poison a DNS server. That breaks the internet because you don't know if you are actually connected to the right website.
		
 */
}
