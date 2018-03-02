//class definition for public class DataItem
public class DataItem	{
	//the DataItem class has four fields
	public String date;
	public String name;
	public String company;
	public String color;

	//the DataItem class has one constructor
	public DataItem(String itemDate, String itemName, String itemCompany, String itemColor){
			this.date = itemDate;
			this.name = itemName;
			this.company = itemCompany;
			this.color = itemColor;
	}

	public String getDate (){
		return this.date;
	}

	public String getName (){
		return this.name;
	}

	public String getCompany (){
		return this.company;
	}

	public String getColor (){
		return this.color;
	}

	//TODO define enumurator methods
}
