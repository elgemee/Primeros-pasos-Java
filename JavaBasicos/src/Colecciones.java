import java.util.HashSet;
import java.util.Set;

public class Colecciones {
public static void main(String[] args) {
	
	
	
	//las colecciones nos sirven para almacenar un conjunto de objetos
	// la diferencia de las colecciones y los objetos
	// es que las colecciones son dinamicas, pueden cambiar
	//el numero de objetos agregados
	
	//set tiene 3 implementaciones
	//no puede contener elementos repetidos
	
	/*<String> frutas = new HashSet <String>();
	frutas.add("mango");
	frutas.add("granada");
	frutas.add("piña");
	frutas.add("sandia");
	frutas.add("mamey");
	frutas.add("fresa");*/

	//for (String fruta: frutas) { //primera necesita un elemento donde se va aguardar, variable fruta
	//	System.out.println(fruta);
	//}
	//TreeSet
	Set<String> frutas = new HashSet <String>();
	frutas.add("mango");
	frutas.add("granada");
	frutas.add("piña");
	frutas.add("sandia");
	frutas.add("mamey");
	frutas.add("fresa");

	for (String fruta: frutas) {
		System.out.println(fruta);
	}
	//LinkedHashSet
}
	
}
