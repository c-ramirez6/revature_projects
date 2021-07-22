package fixtures;

public class Item extends Fixtures{
	private String interactDescription;
	public Item(String name, String shortDescription, String longDescription, String interactDescription) {
		super(name, shortDescription, longDescription);
		this.interactDescription = interactDescription;
	}
	
	public String getInteractDesc() {
		return interactDescription;
	}

}
