package yarmark.pi;

public class Notes {

	//thread- instance of executing code
	//main is the main thread of execution
	//when jvm is waiting for input
	//(ex: Scanner, load JSON file, calculate pi to millionth place),
	//the main thread pauses- it is blocked
	//nothing exceutes
	
	//can write code in java the has multiple threads
	//even if one is blocked, others can continue working
	
	//there will always be a main thread, from which all other threads will come
	
	//making a gui with a label with the value of pi:
	//the window does not open until pi is done being calculated
	//so we want the window to pop up
	// and the label to display pi once it is calculated
	
	//there are many ways to make a thread
	//you can make a thread class which extends Thread
	//the thread does work through the run method
	
	//the operating system manages the thread
	//you just call threadName.start
	
	//WHENEVER YOU HAVE A LONG RUNNING OPERATION,
	//IT MUST BE DONE IN A SEPARTE THREAD
	//for ex: downloading something does not block the rest of the internet/computer
	
	//ex:
	//tabs in modern browsers run on separate threads
	//a process is a program- chrome uses processes, not threads
	//difference between processes and threads- a process can have multiple threads
	
	//any internet connection (ex: weather using json online) is considred a long running operation
	//can't do anything else while it's running
	//button stays depressed because it's still running
}
