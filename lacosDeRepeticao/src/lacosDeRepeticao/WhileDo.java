package lacosDeRepeticao;

public class WhileDo {

	public static void main(String[] args) {
		var x = 0;
		while (x <= 3) {
			System.out.println("Enquanto o x for menor que 3 incrementa");
			x++;
		}
		
		var y = 0;
		do {
			System.out.println("Enquanto o bloco de nota for meno ou igual");
		}while( y++ <=3);
	}
}
