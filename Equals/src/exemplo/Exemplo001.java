package exemplo;

public class Exemplo001 {

	public static void main(String[] args) {
		Veiculo carro1= new Carro(modelo: "Palio", marca: "Fiat", valorVenal: 2000.0);
		Veiculo carro2= new Carro(modelo: "Palio", marca: "Fiat", valorVenal: 2000.0);

		
		System.out.println(carro1.equals(carro2)); //comparação
	}

}
