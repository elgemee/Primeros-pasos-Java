import java.util.Scanner;

public class EjercicioTriangulo {

	public static void main (String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int angulo1, angulo2, angulo3;
		
		System.out.println("Introduce angulo 1");
		angulo1= sc.nextInt();
		System.out.println("Introduce angulo 2");
		angulo2= sc.nextInt();
		System.out.println("Introduce angulo 3");
		angulo3= sc.nextInt();
		int triangulo = angulo1 + angulo2 + angulo3;
		
		if(triangulo <=180) {
			System.out.println("Es un triangulo ");

		}
		
		else 
		System.out.println("no puede ser un triangulo");

		
		

}
	
}
