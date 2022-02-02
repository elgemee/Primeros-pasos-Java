import java.util.Scanner;

public class Compras {

	public static void main (String[] args) {

	
		// solicitar el total de una compra por consola.
				// si la cuenta es de menos de 1000
				// sila cuenta es de 1001 - 4999 10%
				// si la cuenta es de 5001 a 9999 20%
				// si la copra es de 10000 o más 30%
		// imprimir el total con los descuentos incluidos

		
		Scanner sc= new Scanner(System.in);
	
		
		
		System.out.println("Introduce el total de la compra de la consola");
		int precio = sc.nextInt();
		double desc1 = precio*0.90;
		double desc2 = precio*0.80;
		double desc3 = precio*0.70;
		
		
		
		if(precio >=1000 && precio<=4999) {
			System.out.println("tu descuento es de 10% y el precio final es de $ " + desc1);
		}
		
		else if (precio >=5000 && precio<=9999) {
			System.out.println("tu descuento es de 20% y el precio final es de $" + desc2);

		}
		else if (precio >=10000) {
			System.out.println("tu descuento es de 30% y el precio final es de $  " + desc3);

		}
		else 			
			System.out.println("No tienes descuento y tu precio es de $ " + precio);

		
		
		
		
		
	}
}
