package puntoUno;

/**
 * Usando pilas, cree un método que verifique si una cadena de caracteres es palíndroma. 
 * “ana”  ->  a,n,a  -> a, n,a
 * @author crist
 *
 */

public class Main {

	public static void main(String args[]){
		Pila pila = new Pila();
		pila.insertar('a');
		pila.insertar('r');
		pila.insertar('e');
		pila.insertar('n');
		pila.insertar('e');
		pila.insertar('r');
		pila.insertar('a');
		
		System.out.println(pila.verificarPolindroma());
		
		pila.vaciarCola();
		pila.insertar('a');
		pila.insertar('r');
		pila.insertar('e');
		pila.insertar('p');
		pila.insertar('e');
		pila.insertar('r');
		pila.insertar('a');
		
		System.out.println(pila.verificarPolindroma());
	}
	
	
}
