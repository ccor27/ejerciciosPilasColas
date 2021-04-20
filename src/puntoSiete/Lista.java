package puntoSiete;

public class Lista<T> {

	private Nodo<T> inicio;
	private Nodo<T> fin;
	int longitud;

	public Lista() {
		inicio = null;
		fin = null;
		longitud = 0;
	}

	public void insertar(T dato) {
		Nodo<T> nodo = new Nodo<>(dato);
		if (inicio == null) {
			inicio = nodo;
			
		} else {
			Nodo<T> puntero = inicio;
			while (puntero.getSiguiente() != null) {
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nodo);
			
		}
		longitud++;
	}

	public void imprimir() {

		Nodo<T> aux = inicio;

		while (aux != null) {
			System.out.print(aux.getDato() + "\t");
			aux = aux.getSiguiente();
		}

		System.out.println();
	}

	public Nodo<T> getInicio() {
		return inicio;
	}

	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}

	public Nodo<T> getFin() {
		return fin;
	}

	public void setFin(Nodo<T> fin) {
		this.fin = fin;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


}
