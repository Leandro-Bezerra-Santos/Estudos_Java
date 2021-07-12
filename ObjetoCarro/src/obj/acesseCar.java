package obj;

public class acesseCar {

	public static void main(String[] args) {
		Car carro  = new Car();

		System.out.println( "O carro " + carro.getMarca() +" tem "+ carro.getPortas() + " portas");
		System.out.println(carro.andar());
	}

}
