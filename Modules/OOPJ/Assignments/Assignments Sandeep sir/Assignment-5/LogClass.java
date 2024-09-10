package Ass_5_sir;

import java.util.*;

class Logger{
	private String message;
	private static int count = 0;
	
	private Logger() {
		
		this.message = "";
	}
	
//	private static Logger ref;
//	static {
//		ref = new Logger();
//		
//	}
//	public static Logger getref() {
//		
//		return ref;
//	}
	
	private static Logger ref = null;
	public static Logger getref() {
		if(ref == null) 
			ref = new Logger();
		
			return ref;
	}
	
	void setmessage(Scanner sc) {
		if(Logger.count < 1) {
		System.out.println("Enter a Message = ");
		this.message = sc.nextLine();
//		sc.nextLine();
		Logger.count++;
		}
	}
	
	void getmessage() {
		if(Logger.count > 1) {
			System.out.println("You have alreay entered message...");
			Logger.count++;
		}
		else {
			System.out.println(this.message);
			
		}
	}

}

public class LogClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Logger s1 = Logger.getref();
		Logger s2 = Logger.getref();
			
			s1.setmessage( sc );
			s1.getmessage();
			
			s2.setmessage( sc );
			s2.getmessage();
	}

}




/*
Design and implement a class named 
Logger
 wherever required. 
to track and count the number of 
to manage logging messages for an 
application. The class should be implemented as a singleton to ensure that only one 
instance of the 
Logger
 exists throughout the application. 
The class should include the following methods: 
 getInstance()
 : Returns the unique instance of the 
 log(String message)
  getLog()
 Logger
 : Adds a log message to the logger. 
: Returns the current log messages as a 
 clearLog()
 : Clears all log messages. 
*/