// author: Payden Brown
// class ID: CSE360 
// assignment 2
// Description: AddingMachine works like a calculator that adds and 
// subtracts input values from a total value. There is also a clear
// and print option.   

package cse360assign2;

public class AddingMachine {

	private int total;
	private String his;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		his = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		his += (" + " + value);
	}
	
	public void subtract (int value) {
		total -= value;
		his += (" - " + value);
	}
		
	public String toString () {
		return his;
	}

	public void clear() {
		total = 0;
		his = "0";
	
	}
	
}
