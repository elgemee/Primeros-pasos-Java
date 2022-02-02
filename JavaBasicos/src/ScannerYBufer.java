import java.util.Scanner;

public class ScannerYBufer {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		sc.nextLine(); //lo saca del bufer
		
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();

		
		
	//	System.out.println("Introduce otro numero");
// no se necesita declarar mas de 1 Scanner
		//int numero2 = sc.nextInt();
		
		System.out.println("Tu nombre es: " +nombre + " Tu numero es: " + numero1);

	}
}
