package Ciclos;

public class Ciclos {
public static void main (String[] args) {
	
	//while
	/*int control =0;
	while(control <10) {
		System.out.println("Control = " + control);
		control ++;
		
	}*/
	
	//do while- do primero se ejecuta y despues se evalua (while)
//	int control = 3;
	
//	do {
//		//codigo a ejecutar
//		System.out.println("Control = " + control);	
//		control ++;
//		} while (control < 3);
//	
//	for
	
//	for(int i=0; i<3;i++) {
//	System.out.println("Control = " + i);	
//
//	}
	// break & continue
	for(int i=0; i<10;i++) {
		if(i % 2 ==0) { //solo se ejecuta cuando el valor de i sea numero par
			System.out.println("Control = " + i);	
			continue; //permite saltarnos una ejecucion del ciclo
			//break; termina el ciclo
			//solo deja que se ejecute una vez mas lo que esta antes
		}
		System.out.println("Control = " + i);	
	}
	for(int i=0; i <3; i++) {
		System.out.println("Control2 = " + i);	
		continue;
	}
}
}


