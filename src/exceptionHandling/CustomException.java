package exceptionHandling;

import java.util.ArrayList;

public class CustomException extends Exception  {
	String message;
	CustomException(String message) {
		super(message);
	}
	
    public String toString() { 
		return ("MyException Occurred: "+ message) ; 
		
	}
}
