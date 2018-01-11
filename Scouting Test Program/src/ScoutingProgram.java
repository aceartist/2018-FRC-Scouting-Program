import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class ScoutingProgram {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String [] args) throws FileNotFoundException {
		
		
		
		
		
		
	}//End of main method
	
	
public static void printTeamNumbers() throws FileNotFoundException {
		
		Scanner fileReader = new Scanner(new File("C:\\Users\\Nicholas Schirloff\\Desktop\\Java\\Scouting Test Program\\TeamNumbersArkansas2017.txt"));
		ArrayList<Integer> teamNumbers = new ArrayList<Integer>();
		while(fileReader.hasNextInt())
		{
			teamNumbers.add(fileReader.nextInt());
		}
		
		System.out.println(teamNumbers);
		
		fileReader.close();
	}//End of printTeamNumbers

}//End of class
