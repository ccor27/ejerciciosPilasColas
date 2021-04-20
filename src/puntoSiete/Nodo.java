package puntoSiete;



public class Nodo<T> {
	
	private Nodo<T> siguiente;
	private T dato;
	
	
	
	public Nodo(T dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	
	public Nodo<T> getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo<T> siguienteNodo) {
		this.siguiente = siguienteNodo;
	}


	public T getDato() {
		return dato;
	}


	public void setDato(T dato) {
		this.dato = dato;
	}

}
