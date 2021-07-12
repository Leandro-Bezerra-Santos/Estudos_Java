package O.O;

public class Pessoa {
	private String name = "Leandro";
	
	public String getName(){
		return name;
	};
	
	public String metodoApresentarse() {
		return "Hello, my name is " + getName();
	}
	
	public Pessoa(){//Constructor
	}
}

