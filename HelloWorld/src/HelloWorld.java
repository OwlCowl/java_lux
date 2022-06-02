/**
  *This is the simplest class which prints the “Hello,world”message.
  * @author Yana 
 */

public class HelloWorld {
	/**
	 *Main methods which is executed by JVM and prints the message.
	 *@param args command line arguments
	 */
		
	public static void main(String[] args) {		
		System.out.println("Hello world");
		sum(12,13);
		}
	
	
	
	public static void sum(int n, int n2) {

		System.out.println("The sum of numbers is: " + Integer.sum(n, n2));
	}
	

}

