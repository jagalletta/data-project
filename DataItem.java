import java.util.*;
//class definition for public class DataItem
public class DataItem	implements Comparable<DataItem>{
	//the DataItem class has four fields
	public String date;
	public String name;
	public String company;
	public String color;

	@Override
	public int compareTo(DataItem that){
		return color.compareTo(that.color);
	}

	public static void sortByColor(List<DataItem> dataItems){
		Collections.sort(dataItems);
	}

	//the DataItem class has one constructor
	DataItem(String itemDate, String itemName, String itemCompany, String itemColor){
			this.date = itemDate;
			this.name = itemName;
			this.company = itemCompany;
			this.color = itemColor;
	}

	public void printItem (){
		System.out.println("Date: " + this.date);
		System.out.println("Name: " + this.name);
		System.out.println("Company: " + this.company);
		System.out.println("Color: " + this.color);
	}
	//decided to keep attributes public and eliminate get functions
}
