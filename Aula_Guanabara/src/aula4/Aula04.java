package aula4;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.setModelo("Bic");
		//c1.modelo = "Bic"; || Trabalhando com public e privado este � publico 
		
		c1.setPonta(0.5f);
		//c1.ponta = 0.5f; Esse n�o podera ser acessado assim pois esta privado
		
		c1.status();
	}

}
