import java.io.*;
import java.util.*;
public class DataProject	{

	public static void main (String[] args)	{
		//Starting with basic basic basic setup, building from ABSOLUTE ZERO.
		//TODO Will be pushing new commits as this evolves!  :)

		System.out.println("Welcome to my data project!");
		System.out.println("This program will accept the project-data.txt file as input");
		System.out.println("and display its contents grouped by their color attributes.\n");

		//The name of the file to open.
		String fileName = "test-data.txt";

		//one line at a time
		String line = null;
		List<DataItem> dataItemArray = new ArrayList<>();
		try{
			//FileReader reads in text file
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);



			System.out.println("Current file contents:\n");

			int lineCount = 0;
			String tempDate = "";
			String tempName = "";
			String tempCompany ="";
			String tempColor ="";

			while((line = bufferedReader.readLine()) != null){
				String[] tokens = line.split(":");

				switch(lineCount%5){
					case 0: tempDate = tokens[1].toString();
									break;
					case 1: tempName = tokens[1].toString();
									break;
					case 2: tempCompany = tokens[1].toString();
									break;
					case 3:	tempColor = tokens[1].toString();
									dataItemArray.add(new DataItem(tempDate,tempName, tempCompany, tempColor));
									break;
					case 4: break;
				}
				lineCount++;
				//TODO parse lines and store dataItems into array according to their attributes
			}

			//always close files.
			bufferedReader.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException ex){
			System.out.println(
			"Error reading file '"
			+ fileName + "'");
		}
		System.out.println();


		//TODO remove this debug code --
		//Test dataItem to establish functionality of dataItem methods
		DataItem FirstItem = new DataItem("01.05.17", "John Galletta", "Atec LLC", "orange");

		dataItemArray.add(FirstItem);

		DataItem.sortByColor(dataItemArray);
		
		for (DataItem d : dataItemArray){
			d.printItem();
			System.out.println();
		}
		// --

		//TODO add sorting methods to DataItem class definition
		//TODO prompt user for input file path
		//DONE accept input in the form of .txt file.
		//TODO parse file contents into dataItem objects with attributes Date, Name, Company, and Color
		//NOTE Assumption is made that all entries are unique.
		//TODO as objects are created insert into [sorted array or linked list/binary tree (still deciding - need to review)]
		//TODO traverse data structure to output items with some fancy formatting.
		//TODO integrate GUI functionality
	}

}
