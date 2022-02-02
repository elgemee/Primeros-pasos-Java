package Arreglos;

public class Arreglos {
	public static void main(String[] args) {
		
	
 //solo un tipo de dato
// especificar el tamaño o la cantidad de elementos que va a contener

		// 1 manera
	
	int numeros [];//creamos la variable
	numeros = new int [4];//creando el arreglo
	
		// 2 manera 
	String [] nombres = new String [4]; // basado en 0, [0,1,2,3]
	
		// 3 manera
		// array literal
	
	String []nombreFrutas = new String [] {"Manzana","Platano", "Uva","Pera"}; 
	
	numeros [0] =10;	
	numeros [1] =8;
	numeros [2] = 100;
	numeros [3] = 200;
	//numeros [4] = 200;
	
	nombres [0] ="Juan";	
	nombres [1] ="Pedro";
	nombres [2] = "Felipe";
	nombres [3] = "Antonio";
	
	System.out.println(numeros[0]);
	System.out.println(numeros);
	
	// //en arrays, legnth es una propiedad, no lleva parentesis

	for (int i=0; i < numeros.length;i++) {
	System.out.println("Elementos de numero: " + numeros[i]);//[0][1][2][3]
	System.out.println("Elementos de nombres: " + nombres[i]);
	System.out.println("Elementos de frutas: " + nombreFrutas[i]);
	System.out.println("---------------------------------");
	}	
	}	
}
