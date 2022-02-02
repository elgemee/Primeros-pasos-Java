import java.util.Scanner;

public class Calculadora {

	public static void main (String[] args) {

	
	/* Pedir al usuario 2 numeros por consola y preguntarleque desea hacer
	 * 1) suma
	 * 2) resta
	 * 3) division
	 * 4) multiplicacion
	 * 
	 * y despues imprimir el resultado
	 */
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce numero 1" );
		float num1= sc.nextFloat();
		System.out.println("Introduce numero 2" );
		float num2= sc.nextFloat();
		
		System.out.println("1suma"
				+  " 2resta"
				+ " 3division"
				+ " 4multiplicacion" );
		
		int operacion= sc.nextInt();
		

		switch(operacion) {
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1/num2);
			break;
		case 4:
			System.out.println(num1*num2);
			break;
		default: 
			System.out.println("Numero Invalido");

		}
	
	
	}
}
