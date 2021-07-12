package Operators;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean cond = true;
		String ternario = cond ? "O ternario é igual a true" : "O ternario é igual a False";
		
		if (cond) {
			System.out.println("Condição é igual a true");
		} else {
			System.out.println("A condição é igual a false");
		};
		
		System.out.println(ternario);
	}

}
