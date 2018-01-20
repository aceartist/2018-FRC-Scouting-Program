import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;

public class NumberSearch {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String [] args) throws IOException {
		
		File numberList = new File("C:\\Users\\Nicholas Schirloff\\Desktop\\Java\\Number Search\\TestNumberSearch.txt");
		
		System.out.println("Please enter the team you would like to search for.");
		String searchKey = input.nextLine();
		String line;
		String copyLine;
		int instances = 0;
		int matchNumber = 0;
//		ArrayList<String> lineContents = new ArrayList<>();
		String[] arrayContents = new String[5];
		int totalAutoGears = 0;
		int totalAutoGearsDropped = 0;
		
		int[] gearsCollected = new int[5];

		
		try {
				BufferedReader numberSearch = new BufferedReader(new FileReader("C:\\Users\\Nicholas Schirloff\\Desktop\\Java\\Number Search\\TestNumberSearch.txt"));
				while((line = numberSearch.readLine()) != null)
				{
					if(line.contains(searchKey))
					{
						copyLine = line;
						String[] listLine = copyLine.split(" ");
						int teamNumber = Integer.parseInt(listLine[0]);
						int matchNumbers = Integer.parseInt(listLine[1]);
						String robotMobility = listLine[2];
						String crossBaseLine = listLine[3];
						int autoGears = Integer.parseInt(listLine[4]);
						int autoGearsDropped = Integer.parseInt(listLine[5]);
						String rotorTurning = listLine[6];
						totalAutoGearsDropped += autoGearsDropped;
						totalAutoGears += autoGears;
						System.out.println("Report: " + teamNumber + " Match: " + matchNumbers + " Robot Mobility: " + robotMobility 
								+ " Cross Base Line: " + crossBaseLine + " Gears: " + autoGears + " Dropped Gears: " + autoGearsDropped + " Rotor Turning: " + rotorTurning);
						instances += 1;
					}

				}
				
				double averageAutoGears = totalAutoGears / totalAutoGearsDropped;
				System.out.println("Average Auto Gears: " + averageAutoGears);
				
				
				System.out.println("Found " + searchKey + " " + instances + " time(s).");
			}
		catch(FileNotFoundException e) {
			
		}
		
		
	}//End of main method
	
	public static void findTeam(File dataSheet, int searchKey) throws IOException {
//		
//		try {
//			
//			
//			
//		}
		
		
		
		
	}
	
}//End of class
