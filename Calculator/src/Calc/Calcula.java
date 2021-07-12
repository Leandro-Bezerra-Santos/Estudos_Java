package Calc;
import java.util.*;
public class Calcula {
	public static void main(String[] args){

        final var sdc_recebe = new Scanner(System.in);
        
			System.out.print("Digite um valor:");
	    	final var sdc_armazena = sdc_recebe.nextInt();
	    	
	    	System.out.println("===========MULTIPLICAÇÃO==========");
	        
	    for(int i = 0; i <= 10; i++){
			
	      System.out.println(sdc_armazena + " X " + i + " = " + sdc_armazena * i);

	    };
	    

   
	}
}