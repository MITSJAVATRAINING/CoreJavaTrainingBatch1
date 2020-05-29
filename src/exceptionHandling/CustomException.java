package exceptionHandling;

public class CustomException extends Exception {
	String message;
	CustomException(String message) {
	}
	
    public String toString() { 
		return ("MyException Occurred: "+ message) ; 
	}
}
