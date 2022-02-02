import java.util.Scanner;

public class EstructuraDeControlSwitch {

	public static void main (String[] args) {

	//Estructuras de Control nos sirve para controlar el flujo de 
	//comportamiento de un programa. Para la toma de decisiones.
	
	/*
	 switch (condicion_a_evaluar) {
	 case "valor":
	 	//codigo a ejecutar
	 	//break;
	 ...
	 case "n":
	 	//codigo a ejecutar
	 	//break;
	 default:
	 	//codigo a ejecutar
	  }
	 */
	
	//Solicitar al usuario un dia de la semana y mostrar un mensaje
	System.out.println("Introduce un día de la semana y recibe un mensaje :)" );
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();
	
	switch(dia.toLowerCase()) {
	case "lunes":
		System.out.println("Ya mero es viernes, toma un cafe");
		break;
	case "martes":
		System.out.println("lunes chiquito");
		break;
	case "miercoles":
		System.out.println("miercoles pero a que costo");
		break;
	case "jueves":
		System.out.println("juebebes de sed peligrosa");
		break;
	case "viernes":
		System.out.println("viernes de party");
		break;
	case "sabado":
		System.out.println(" para convivir con amigos y familia");
		break;
	case "domingo":
		System.out.println("domingo de futbol");
		break;
	default:
		System.out.println("Dia desconocido");

	}
	
		
	/* Pedir al usuario 2 numeros por consola y preguntarleque desea hacer
	 * 1) suma
	 * 2) resta
	 * 3) division
	 * 4) multiplicacion
	 * 
	 * y despues imprimir el resultado
	 */
	
	
	
}
}