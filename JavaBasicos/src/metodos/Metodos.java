package metodos;

public class Metodos {
// Metodo es una funcion
	
	//Atributos de la clase
	
	int a, b;
	
	//Metodo void(vacio)
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + " es " + resultado);
		
	
	}
	
	public int sumaConRetorno() {
		//int resultado = a+b;
		//return resultado;
		return a + b;
	}
	
	//argumentos
		//suma (argumentos)
	
	public double multiplicarConArgumentos (int arg1, double arg2) {
		int c= arg1;
		double d= arg2;
		return c* d;
		
	}
		// Metodo estático
		public static void imprimirNombre (String nombre) {
			System.out.println("Mi nombre es: " + nombre);
	
}
}