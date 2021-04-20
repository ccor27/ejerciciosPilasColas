package puntoUno;

public class Nodo {
	
	private Nodo siguiente;
	private char dato;
	
	public Nodo(){
		
	}
	public Nodo(char dato){
		this.dato = dato;
		this.siguiente = null;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public char getDato() {
		return dato;
	}
	public void setDato(char dato) {
		this.dato = dato;
	}
}
