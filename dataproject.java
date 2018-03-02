import java.io.*;

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

		try{
			//FileReader reads in text file
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			System.out.println("Current file contents:\n");

			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
				//TODO parse lines and store dataItems into tree according to their attributes
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



		//TODO remove this debug code --
		//Test dataItem to establish functionality of dataItem methods
		DataItem FirstItem = new DataItem("January 5, 2017", "John Galletta", "Atec LLC", "orange");

		System.out.println("\n");
		System.out.println(FirstItem.getDate());
		System.out.println(FirstItem.getName());
		System.out.println(FirstItem.getCompany());
		System.out.println(FirstItem.getColor());
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
