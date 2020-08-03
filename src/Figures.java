/*Name: Jonah Miller
 Course Name: Programming Fundamentals
 Semester: Summer 2020
 Assignment Name: Programming Assignment 2 (Figures)
 */


import java.util.Scanner;

public class Figures {
	public static void main(String[] args) {
	
		//Display identifier
		System.out.println("Programming Fundamentals Summer 2020");
		System.out.println("NAME: Jonah Miller");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println();
		
		//Welcome message and ask for user to input number
		System.out.print("Enter the size of the figure (odd number): ");
				
		//create a new scanner which will be used to accept user input
		Scanner userInput = new Scanner(System.in);
		
		int size = userInput.nextInt();
		
		//checks to make sure that the user input is odd. If not, throws an error message and asks for new input
		while (size % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number.");
			System.out.println();
			System.out.print("Re-Enter the size of the figure: ");
			size = userInput.nextInt();
		}
		System.out.println();
		
		//Displays the menu
		System.out.println("MENU:");
		System.out.println("1. Print box");
		System.out.println("2. Print diamond");
		System.out.println("3. Print X");
		System.out.println("4. Quit Program");
		System.out.println();
		
		//Creates a variable which will be used to select an option from the menu
		int menuSelect = 0;
		
		//The program will loop until the user selects Quit Program from the menu
		while(menuSelect != 4) {
		
		//Asks for selection of an option from the menu, and then uses a switch statement to call the correlated method
		System.out.print("Please select an option: ");
		menuSelect = userInput.nextInt();
		System.out.println();
		
		switch(menuSelect) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			}
			
		}

		userInput.close();
	}
	
	//uses a loop function to print out an x character for a length and width equal to the size variable

	public static void printBox(int size) {
		
		for(int height = 0; height < size; height++) {
			for(int width = 0; width < size; width ++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	
	/*
	 * This printDiamond method functions by essentially drawing four separate horizontal lines one row at a time.
	 * It accomplishes this by splitting the diamond shape into half. For loops allow the System.out.print to print one character
	 * at a time, and the int variables "leftDistance" and "rightDistance", which are based off of the
	 * diamond's size, tell the program when to print an "X" character. The first For Loop handles the top half of the diamond
	 * (with the nested for loops inside handling first the left then the right side), while the second For loop handles the
	 * bottom half of the diamond. 
	 */
	public static void printDiamond(int size) {
		
		int leftDistance = size/2;
		int rightDistance = size/2;
		
		for (int height = 0; height < size/2; height++) {
			
			for(int width = 0; width <= leftDistance; width++) {
				if(width != (leftDistance)) {
					System.out.print(" ");
				}
				else{
					System.out.print("X");
				}
			}
			
			for(int width = leftDistance; width <= size; width++) {
				if(width != (rightDistance)) {
					System.out.print(" ");
					}
				else{
					System.out.print("X");
					}	
				
				}
		
			leftDistance--;
			rightDistance++;
			System.out.println();
		}
		
		leftDistance = 0;
		rightDistance = size - 1;
		
		for (int height = 0; height <= size/2; height++) {
			
			for(int width = 0; width <= leftDistance; width++) {
				if(width != (leftDistance)) {
					System.out.print(" ");
				}
				else{
					System.out.print("X");
				}
			}
			
			for(int width = leftDistance; width <= size; width++) {
				if(width != (rightDistance)) {
					System.out.print(" ");
					}
				else{
					System.out.print("X");
					}	
				
				}
		
			leftDistance++;
			rightDistance--;
			System.out.println();
		}
		
		System.out.println();
	}

	
	/*
	 * Because an X shape is a essentially a diamond which has been inverted at it's center point, this printX loop is almost
	 * the exact same as the printDiamond method, but with the top and bottom defining loops switched. There has also been a 
	 * minor adjustment in where the program is told to print an "X", so that the output matches the shape as defined by 
	 * the assignment.
	 */
	public static void printX(int size) {
				
		int leftDistance = 0;
		int rightDistance = size - 2;
		
		for (int height = 0; height < size/2; height++) {
			
			for(int width = 0; width <= leftDistance; width++) {
				if(width != (leftDistance)) {
					System.out.print(" ");
				}
				else{
					System.out.print("X");
				}
			}
			
			for(int width = leftDistance; width <= size; width++) {
				if(width != (rightDistance)) {
					System.out.print(" ");
					}
				else{
					System.out.print("X");
					}	
				
				}
		
			leftDistance++;
			rightDistance--;
			System.out.println();
		}
		
		leftDistance = size/2;
		rightDistance = size/2 - 1;

		
		for (int height = 0; height <= size/2; height++) {
			
			for(int width = 0; width <= leftDistance; width++) {
				if(width != (leftDistance)) {
					System.out.print(" ");
				}
				else{
					System.out.print("X");
				}
			}
			
			for(int width = leftDistance; width <= size; width++) {
				if(width != (rightDistance)) {
					System.out.print(" ");
					}
				else{
					System.out.print("X");
					}	
				
				}
		
			leftDistance--;
			rightDistance++;
			System.out.println();
		}
		
		System.out.println();
	}

}



