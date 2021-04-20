package puntoDos;

public class Main {

	/**
	 * Obtener una secuencia aleatoria de 10 números, guardarlos en una Lista enlazada simple  y ponerlos en una pila
	 *  Imprimir la secuencia original y a continuación, imprimir la pila extrayendo los elementos.
	 */
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		for (int i = 0; i < 10; i++) {
			lista.insertar((int) (Math.random() * 10) + 1);
		}
		
		lista.duplicarLista();
        
		Pila pila = new Pila();
		Nodo nodo = lista.obtenerNodo();
		while(nodo!=null){
			//System.out.println("entro");
			pila.insetar(nodo.getDato());
			nodo = lista.obtenerNodo();
		}
		
		System.out.println("se imprime la secuencia original");
		System.out.println(lista.mostrarLista());
		System.out.println("se muestra la pila");
		System.out.println(pila.mostrarPila());
	}

}
