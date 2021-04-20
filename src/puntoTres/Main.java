package puntoTres;

public class Main {
	/**
	 *Concatenar dos pilas.
	 * @param args
	 */

	public static void main(String[] args) {
		
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();

		pila1.insertar(1);
		pila1.insertar(2);
		pila1.insertar(3);
		pila1.insertar(4);
		pila1.insertar(5);
		System.out.println("mostramos la primer pila");
		
		pila1.mostrar();
		
		pila2.insertar(6);
		pila2.insertar(7);
		pila2.insertar(8);
		pila2.insertar(9);
		pila2.insertar(10);
		System.out.println("mostramos la segunda pila");
		pila2.mostrar();
		Pila pila3 = new Pila();
		
		Nodo nodo = pila1.obtenerValor();
		while(nodo!=null){
			pila3.insertar(nodo.getDato());
			nodo = pila1.obtenerValor();
		}
		
		Nodo nodo2 = pila2.obtenerValor();
		while(nodo2!=null){
			pila3.insertar(nodo2.getDato());
			nodo2 = pila2.obtenerValor();
		}
		System.out.println("mostramos la tercer pila");
		pila3.mostrar();
		
		
	}

}
