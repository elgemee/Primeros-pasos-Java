package Arreglos;

public class ManipularArreglo {
public static void main(String[] args) {
	
	/*
	  Crea una clase llamara ManipularArreglo
crea un array con los siguientes n�meros enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total, la suma de los n�meros pares y la suma de los n�meros impares.

	 */
	
	int []numeros = new int [] {1,6,45,53,80,102,145,326,450,892}; 
	int par=0, impar=0;
	for (int i=0; i < numeros.length;i++) {
		System.out.println("Elementos de numero: " + numeros[i]);
		
	}
	for(int i=0; i<10;i++) {

		if(numeros[i] % 2 ==0) {
			par ++;
			System.out.println("Numero Par = " + numeros[i]);
		}
		else {
			impar ++;
			System.out.println("Numero Impar = " + numeros[i]);
			
		}
		}
}
}

