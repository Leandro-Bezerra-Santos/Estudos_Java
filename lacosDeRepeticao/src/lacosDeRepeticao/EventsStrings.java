package lacosDeRepeticao;

public class EventsStrings {

	public static void main(String[] args) {
		// PACOTE JAVA.LANG STRING � UMA SEQUENCIA DE CARACTERES
		
		String name = "Leandro";
		String surname= "Bezerra";
		String fullName = name + surname;

		var string =  new String();
		
		System.out.println(fullName);
		
		System.out.println(fullName.charAt(3));//Vai me devolver a posicao que eu colocar no parenteses
		
		System.out.println(fullName.length());// Traz a quantidade de strings
		
		System.out.println(fullName.toLowerCase());//Letras minusculas
		
		System.out.println(fullName.toUpperCase());//Letras maiusculas
		
		System.out.println(fullName.contains("L"));//Ve se existe essa letra
		
		System.out.println(fullName.replace("L", "A"));//Troca uma letra pela outra
		
		System.out.println(fullName.equals("JOAO"));//Comparando se os dois nomes sao iguais
		
		System.out.println(fullName.equalsIgnoreCase(fullName));//Vai ignorar todas letras maiusculas desnecessaria e ira arrumar
		
		System.out.println(String.format("O meu nome � %s %s",name,surname));//na onde te o %s ele coloca a variavel 
		
		
	};

};
