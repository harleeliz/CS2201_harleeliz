/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTIII;

import java.io.IOException;
public class LeaderBoardTest {  // driver/client program	
	public static void main(String[] args) throws IOException{
		System.out.println("Test Case 1 - default constructor, insertNewScore, toString");
		LeaderBoard b=new LeaderBoard();
		boolean a1=b.toString().equals("[]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[]");
		b.insertNewScore(5);
		boolean a2=b.toString().equals("[5]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[5]");
		b.insertNewScore(8);
		boolean a3=b.toString().equals("[8, 5]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[8,5]");
		b.insertNewScore(1);
		boolean a4=b.toString().equals("[8, 5, 1]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[8, 5, 1]");
		b.insertNewScore(3);
		boolean a5=b.toString().equals("[8, 5, 3, 1]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[8, 5, 3, 1]");
		b.insertNewScore(12);
		boolean a6=b.toString().equals("[12, 8, 5, 3, 1]");	
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 5, 3, 1]");
		b.insertNewScore(7);
		boolean a7=b.toString().equals("[12, 8, 7, 5, 3]");	
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 5, 3]");
		b.insertNewScore(4);
		boolean a8=b.toString().equals("[12, 8, 7, 5, 4]");	
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 5, 4]");
		b.insertNewScore(5);
		boolean a9=b.toString().equals("[12, 8, 7, 5, 5]");	
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 5, 5]");
		b.insertNewScore(6);
		boolean a10=b.toString().equals("[12, 8, 7, 6, 5]");	
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 6, 5]");
		b.insertNewScore(6);
		boolean a11=b.toString().equals("[12, 8, 7, 6, 6]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 6, 6]");
		b.insertNewScore(15);
		boolean a12=b.toString().equals("[15, 12, 8, 7, 6]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[15, 12, 8, 7, 6]");
		b.insertNewScore(1);
		boolean a13=b.toString().equals("[15, 12, 8, 7, 6]");
		System.out.println("Your Output:    "+b.toString());
		System.out.println("Expected Output:"+"[15, 12, 8, 7, 6]");
		if (a1&&a2&&a3&&a4&&a5&&a6&&a7&&a8&&a9&&a10&&a11&&a12&&a13) System.out.println("PASSED");
		else System.out.println("FAILED");

		System.out.println("Test Case 2 - non-default constructor");
		LeaderBoard c=new LeaderBoard(5, "a.txt");
		boolean a21=c.toString().equals("[12, 8, 7, 6, 6]");
		System.out.println("Your Output:    "+c.toString());
		System.out.println("Expected Output:"+"[12, 8, 7, 6, 6]");
		if (a21) System.out.println("PASSED");
		else System.out.println("FAILED");

		System.out.println("Test Case 3 – saveToFile");
		c.insertNewScore(9);
		c.saveToFile("c.txt");
		LeaderBoard d=new LeaderBoard(5, "c.txt");
		boolean a31=d.toString().equals("[12, 9, 8, 7, 6]");
		System.out.println("Your Output:    "+d.toString());
		System.out.println("Expected Output:"+"[12, 9, 8, 7, 6]");
		if (a31) System.out.println("PASSED");
		else System.out.println("FAILED");
	}
}
