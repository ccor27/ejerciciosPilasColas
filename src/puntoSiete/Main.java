package puntoSiete;

/**
 * Codificar un método que, recibiendo como parámetro una lista genérica, invierta su  contenido
 * con recursividad
 * @author crist
 *
 */

public class Main {

	public static void main(String[] args) {

		Lista<Integer> lista = new Lista<>();

		lista.insertar(56);
		lista.insertar(34);
		lista.insertar(78);
		lista.insertar(90);
		lista.insertar(13);
		lista.insertar(28);
		lista.insertar(45);
		//lista antes de invertir
		System.out.println("lista antes de invertirla");
		lista.imprimir();
		System.out.println();
		InvertirLista(lista);
		//lista despues de invertir
		System.out.println("lista despues de invertirla");
		lista.imprimir();

	}

	public static void InvertirLista(Lista<Integer> lista){
		Nodo<Integer> nodo;
		
		if (lista==null || lista.getLongitud()==1) {
			
              System.out.println("la lista esta vacia o tiene un solo elemento");
              
		}else{
			
			nodo= invertirNodo(lista.getInicio().getSiguiente(),lista.getInicio());
			lista.getInicio().setSiguiente(null);
			lista.setFin(lista.getInicio());
			lista.setInicio(nodo);
		}
		
	}

	private static Nodo<Integer> invertirNodo(Nodo<Integer> actual, Nodo<Integer> anterior) {
	
	Nodo<Integer> nodo;
	
	if (actual==null) {
		
		nodo= anterior;
	}else {
		
		nodo= invertirNodo(actual.getSiguiente(), actual);
		actual.setSiguiente(anterior);
	}
	
	return nodo;
}
	

}

