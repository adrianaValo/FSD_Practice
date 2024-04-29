package com;

class VoteException extends Exception {
	public VoteException() {
	super();
}
	public VoteException(String msg) {
		super(msg); // we are calling Exception class parameter onstructor to set the custom message
	}
}

public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 12;
		try {
			if(age >= 21) {
				System.out.println("You can vote");
			} else {
				//throw new Exception(); //generic exception generated
				//throw new Exception("Age must be >= 21"); //exception with message
				//throw new ArithmeticException(); // throw specific exception
				// throw new ArithmeticException("Age must be >= 21");
				throw new VoteException("Age must be >= 21"); //parameter called
			}
		} catch(Exception e) {
			System.out.println("Exception " + e.toString());
		}

	}

}
