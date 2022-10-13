package Disk;

/**
 * 
 */

/**
 * @author Prabdeep Gill
 * Data Structures 
 * - Towers of Hanoi (recursion)
 *
 */
public class Disk {

	//Java Recursion
	
	// n -1, but also making sure a destination is also available for that disk, as well as a temporary 
	// storage area for select desk
	
	// if we want to change the number for our tower size, all we have to do is go to int n = 3, and replace it with a value of our choosing
	// I did not do anything with user input this time around.
	
	// Use array lists
	
	static void diskPosition(int n, char start, char transition, char temp) {
		
		// start
		// transition 
		// temporary
		
//		char start;
//		char transition 
//		char temp
//		
		
		// this will represent our base case ----- n = 1
		if (n == 1) 
		{
			System.out.println(" Move disk 1 from tower " + start + " to tower " + transition);
			return;
		}
		
		diskPosition(n-1, start, transition, temp);
			System.out.println(" Move disk " + n + " from tower " + start + " to tower " + transition);
		diskPosition(n-1, temp, transition, start);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this will represent the number of disks that are present, we can change this value any time and the console
		// will output as follows. Sample output does work, although the greater the n, the longer it takes to compute
		
		int n = 15;
		
		//our 3 towers, which will be represented following the sample output provided in the instructions
		
		//different towers we will be moving between 
		// disk can only be between these 3 locations
		diskPosition(n, 'A' , 'B' , 'C');

	}
}





