package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String [] args) {
		
		System.out.println("Vamos fazer uma conversão?");
		System.out.println("Digite o valor em Celsius");
	
		Scanner entrada = new Scanner(System.in);
		double celsius = entrada.nextInt();
		
		double conversaoc = celsius * 9 / 5 + 32;
		System.out.println("Valor em fahrenheit é de" +conversaoc+ "°F graus");
		
		System.out.println("Digite o valor em Fahrenheit");
		double fahrenheit = entrada.nextInt();
		
		double conversaof = fahrenheit - 32 * 5 / 9;
		
		System.out.println("Seu valor em celcius é de" +conversaof+ "°C graus");
	}
}	