package cse360assignment01;

/**
 * This class adds or subtracts to get a total.
 * @author Sandra Avila Robledo
 */
public class AddingMachine {
	 private int total;
	 private String transactions = "0";
	 
	 /**
	  * AddingMachine default constructor
	  */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  /**
	   * This returns the current total from adding/subtracting to a value
	   * @return the current total
	   */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * This adds to the total variable
	   * @param value the number to add to the total
	   */
	  public void add (int value) {
		  total = total + value;
		  transactions = transactions + " + " + value;
	  }
	  /**
	   * This subtracts from the total variable
	   * @param value the number to subtract from the total
	   */
	  public void subtract (int value) {
		  total = total - value;
		  transactions = transactions + " - " + value;
	  }
	  /**
	   * This returns the history from adding and subtracting to the initial total 0 
	   */
	  public String toString () {
	    return transactions;
	  }
	  /**
	   * This clears the AddingMachine and history of calculations
	   */
	  public void clear() {
		  total = 0;
		  transactions = "0";
	  }
	  
	  public static void main (String [] args) {
		  System.out.println("TEST");
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator);
		System.out.println("Total = " + myCalculator.getTotal());
		myCalculator.clear();
		myCalculator.add(12);
		myCalculator.subtract(4);
		myCalculator.add(8);
		myCalculator.add(10);
		myCalculator.add(3);
		myCalculator.subtract(19);
		System.out.println(myCalculator);
		System.out.println("Total = " + myCalculator.getTotal());
		}
}
