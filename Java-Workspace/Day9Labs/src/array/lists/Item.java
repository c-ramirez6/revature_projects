package array.lists;

public class Item {
	private int id;
	private String description;
	
	public Item() {
		
	}
	
	public Item(int id, String description)	{
		super();
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription()	{
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Item [id:" + this.id + " description:" + this.description + "]";
	}

}
