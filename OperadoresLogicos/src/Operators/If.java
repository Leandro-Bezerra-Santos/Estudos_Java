package Operators;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean cond = true;
		String ternario = cond ? "O ternario � igual a true" : "O ternario � igual a False";
		
		if (cond) {
			System.out.println("Condi��o � igual a true");
		} else {
			System.out.println("A condi��o � igual a false");
		};
		
		System.out.println(ternario);
	}

}
