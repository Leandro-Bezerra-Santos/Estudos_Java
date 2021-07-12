package obj;

public class Car {
	private String marca = "fiat";
	private Integer portas = 4;
	
	public String getMarca() {
		return marca;
	}
	public Integer getPortas() {
		return portas;
	}
	
	public String andar(){
		return "O carro " + getMarca() + " Andou!!!!!!!";
	}
}
