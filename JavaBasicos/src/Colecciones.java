import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
public static void main(String[] args) {
	
	
	
	//las colecciones nos sirven para almacenar un conjunto de objetos
	// la diferencia de las colecciones y los objetos
	// es que las colecciones son dinamicas, pueden cambiar
	//el numero de objetos agregados
	
	//set tiene 3 implementaciones
	//no puede contener elementos repetidos
	//
	
	//HashSet ---velocidad
	//Los elementos mantienen un orden
	//Es la implementacion mas rapida de los set
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
	//TreeSet---orden
	//Esta implemaentacion ordena los elementos en funcion 
	//de sus valores
	//es la implementacion mas lenta
	
//	Set<String> frutas = new TreeSet <String>();
//	frutas.add("mango");
//	frutas.add("Granada");
//	frutas.add("piña");
//	frutas.add("sandia");
//	frutas.add("mamey");
//	frutas.add("fresa");
//
//	for (String fruta: frutas) {
//		System.out.println(fruta);
//	}
	
	
	//LinkedHashSet
	//En medio de los mas rapidos
	//es mas costoso que HashSet--
	//ordena los elementos en orden de de insercion
//	
//	Set<String> frutas = new LinkedHashSet <String>();
//	frutas.add("mango");
//	frutas.add("Granada");
//	frutas.add("piña");
//	frutas.add("sandia");
//	frutas.add("mamey");
//	frutas.add("fresa");
//
//	for (String fruta: frutas) {
//		System.out.println(fruta);
//	}
	
	//Orden de velocidad 
	//1.HashSet
	//2.LinkedHashSet
	//3.TreeSet
	
	//-------------------------------------------------------
	
	//List
	//Se permiten elementos duplicados
	//acceder a elementos especificos
	//buscar elementos
	
	//charAt para tipo cadenas nadamas-string
	
	//ArrayList
	
	List<String> pokemones = new ArrayList<String>();
	pokemones.add("Chicorita");
	pokemones.add("Eevee");
	pokemones.add("Psyduck");
	pokemones.add("Dragonite");
	pokemones.add("Charizard");
	pokemones.add("Gengar");
	pokemones.add("Flygon");

// add si agregamos un indice y un elemento, posiciona
	//el elemento en el indice y realiza un desplazamiento
	// es decir no borra el elemento en la posicion si no que lo desplaza
	
	pokemones.add(2,"Pikachu");
	
	// remove, remueve el elemento de la posicion especificada
	pokemones.remove(5);
	
	//set reemplaza el elemento en la posicion especificada
	pokemones.set(0,"Lugia");
	
	for (String pokemon : pokemones) {
		System.out.println(pokemon);
	}
	System.out.println("------------------");
	System.out.println(pokemones.get(4));
	
	//indexOf, nos va a devolver la posicion del elemento
	//y si el elemento no se encuentra nos devuelve -1
	
	System.out.println(pokemones.indexOf("Topegi"));
	
	System.out.println("**********************************************");
	
	//String miCadena ="Hola a todos";
	//System.out.println(miCadena.charAt(0));

	//LinkedList
	//Es una lista doblemente enlazada
	//sabe quien esta antes y despues
	//es mas rapido para insertar y remover elementos
	
	List<String> digimones = new LinkedList<String>();
	digimones.add("Agumon");
	digimones.add("Patamon");
	digimones.add("Angemon");
	digimones.add("Andromon");
	digimones.add("Greymon");

	for (String digimon : digimones) {
		System.out.println(digimon);
	}
	
	//Colecciones Map
	//Asocia claves a valores.
	//No puede contener claves duplicadas
	//Solo puede tener un valor asociado
	
	//HashMap
	//Tiene mejor rendimiento pero no garantiza un orden
	//A la hora de hacer iteraciones.
	
	
	Map<Integer, String> usuarios = new HashMap<Integer, String>();
	usuarios.put(1, "Alexis Gonzalez");
	//usuarios.put(2,Alexis); HashMap no acepta claves duplicadas 
	usuarios.put(2, "Mauricio");
	usuarios.put(3, "Angel");
	usuarios.put(4, "Miguel");
	usuarios.put(5, "");

	System.out.println("**********************************************");

	System.out.println(usuarios.get(1));
	
	//KeySet
	//Nos permite recuperar el nombre de la clave
	System.out.println(usuarios.keySet());

	//values
	//Nos permite recuperar el valor directamente
	System.out.println(usuarios.values());
	
	
	//TreeMap
	Map<String, String> tamales = new TreeMap<String, String>();
	tamales.put("Oaxaqueño","Mole Rojo");
	tamales.put("Torta","Mole Verde");
	tamales.put("Dulces","Gansito");
	tamales.put("Salado","Cochinita");

	System.out.println("***************************************");
	System.out.println(tamales.keySet());
	System.out.println(tamales.values());


	System.out.println(tamales);
	
	
	tamales.entrySet().forEach(elemento -> {	
	//System.out.println(elemento.getKey().toString()+ elemento.getValue().toString());
	System.out.println(elemento.getKey());
	System.out.println(elemento.getValue());

	});
	
	//LinkedHashMap
	Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
	carros.put(1,"Volvo");
	carros.put(132,"Ferrari");
	carros.put(554,"Jetta");
	carros.put(4,"Mustang");
	System.out.println("***************************************");
	System.out.println(carros.keySet());
	System.out.println(carros.values());

	
	
	
	}

}



