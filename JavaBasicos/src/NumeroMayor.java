import java.util.Scanner;

public class NumeroMayor {

	public static void main (String[] args) {

		
	/*
	 * Pedir 3 números al usuario y mostrar un mensaje con el
	 * número mayor
	 * */
		Scanner sc= new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Introduce numero 1");
		numero1= sc.nextInt();
		System.out.println("Introduce numero 2");
		numero2= sc.nextInt();
		System.out.println("Introduce numero 3");
		numero3= sc.nextInt();

				
		if(numero1>numero2 && numero1>numero3) {
			System.out.println("Es mayor el numero1 ");

		}
		
		else if(numero2>numero1 && numero2>numero3) {
			System.out.println("Es mayor el numero2 ");

		}
		else if(numero3>numero1 && numero3>numero2) {
			System.out.println("Es mayor el numero3 ");

		}
		
		
	}
	}
