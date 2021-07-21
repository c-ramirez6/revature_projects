package lists;

public class List {
	private String[] elements = new String[8];
	
	public String get(int index) {
		return this.elements[index];
	}
	
	public void set(int index, String data) {
		this.elements[index] = data;
	}
	
	public int add(String value)	{
		int index = -1;
		
		for(int i = 0; i < this.elements.length; i++)	{
			if(null == this.elements[i])	{
				this.elements[i] = value;
				return i;
			}
		}
		
		String[] temp = new String[this.elements.length * 2];
		for(int i = 0; i < this.elements.length; i++) {
			temp[i] = this.elements[i];
		}
		
		index = this.elements.length;
		temp[elements.length] = value;
		this.elements = temp;
		return index;
	}
	
	public String remove() {
        int index = -1;
        String value = "";
    
        for (int i = this.elements.length-1; i >= 0; i--) {
            if (null != this.elements[i]) {
                index = i;
                value = this.elements[i];
                this.elements[i] = null;
                break;
            }
        }
     
        if (index == -1){
            return value;
        }
    
        if (index % 8 == 0 && this.elements.length > 8 &&   this.elements.length > index){
            String[] temp = new String[index];
     
            for (int i = 0; i < temp.length; i++) {
            temp[i] = this.elements[i];
            }
    
            this.elements = temp;
        }
    
        return value;
    }
}
