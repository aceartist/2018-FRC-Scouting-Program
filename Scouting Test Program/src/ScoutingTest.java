import java.awt.List;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ScoutingTest {
	
	//Declare public Scanner
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int teamNumber;
		
		System.out.println("Welcome to the StatScout program. Would you like to see the team list?");
		System.out.println("Please enter the team number.");
		teamNumber = input.nextInt();
		loadData(teamNumber);

		input.close();

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
	
	public static void numberSearch() throws IOException {
	
		BufferedReader intake = new BufferedReader(new FileReader("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Nicholas Schirloff\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Java\\\\\\\\\\\\\\\\Scouting Test Program\\\\\\\\\\\\\\\\TestNumberSearch.txt"));
		String line;
		
//		while(intake.hasNextLine) != null)
//		{
//			
//		}
		
		File numberSearch = new File("C:\\\\\\\\Users\\\\\\\\Nicholas Schirloff\\\\\\\\Desktop\\\\\\\\Java\\\\\\\\Scouting Test Program\\\\\\\\TestNumberSearch.txt");
		Scanner search = new Scanner(numberSearch);
		System.out.println("Enter the team number.");
		int teamNumber = input.nextInt();
		
		
//		Scanner search = new Scanner("C:\\\\Users\\\\Nicholas Schirloff\\\\Desktop\\\\Java\\\\Scouting Test Program\\\\TestNumberSearch.txt");
//		
//		File numberSearch = new File("C:\\Users\\Nicholas Schirloff\\Desktop\\Java\\Scouting Test Program\\TestNumberSearch.txt");
//		System.out.println("Please enter your desired team number.");
//		int teamNumber = input.nextInt();
//		
//			
//		while(input.hasNextLine()) {
//	        System.out.println(search.nextInt(teamNumber));
//		}
	        
	}//End of numberSearch

	public static void scannerSearch() throws FileNotFoundException {
		
		Scanner search = new Scanner("C:\\\\\\\\Users\\\\\\\\Nicholas Schirloff\\\\\\\\Desktop\\\\\\\\Java\\\\\\\\Scouting Test Program\\\\\\\\TestNumberSearch.txt");
		System.out.println("Enter the team number you are searching for.");
		int teamNumber = input.nextInt();
		input.nextLine();
		
		while(search.hasNextLine())
		{
			
			
		}
		
	}//End of scannerSearch
	 
//	public ArrayList<Integer> loadDataFor(String name) throws IOException {
//	    ArrayList<Integer> data = new ArrayList<>();
//	    try (Scanner s = new Scanner(file)) {
//	        while (s.hasNextLine()) {
//	            String[] row = s.nextLine().split("\\s+");
//	            if (row[0].equalsIgnoreCase(name)) {
//	                for (int i = 1; i < row.length; i++) {
//	                    data.add(Integer.parseInt(row[i]));
//	                }
//	            }
//	        }
//	    }
//	    return data;
//	}
	
	
	
	public static ArrayList<Integer> loadData(int searchKey) throws IOException {
		
		ArrayList<Integer> teamNumber = new ArrayList<>();
		
		try(Scanner search = new Scanner("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Nicholas Schirloff\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Java\\\\\\\\\\\\\\\\Scouting Test Program\\\\\\\\\\\\\\\\TestNumberSearch.txt")){
			while(search.hasNextLine())
			{
				String[] line = search.nextLine().split("\\s");
				if(line[0].equals(searchKey))
				{
					for(int i = 1; i < line.length; i++)
					{
						teamNumber.add(Integer.parseInt(line[i]));
					}
				}
			}
			
			
		}//End of try
		
		System.out.println(teamNumber);
		
		return teamNumber;
		
	}//End of loadData

}//End of class
