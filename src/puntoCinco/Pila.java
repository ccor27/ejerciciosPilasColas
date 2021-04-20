package puntoCinco;


public class Pila {

	private Nodo inicio;
	
	public Pila(){
		this.inicio = null;
	}
	
	public void insertar(int dato){
		Nodo nodo = new Nodo(dato);
		nodo.setSiguiente(inicio);
		inicio = nodo;
	}
	
	public Nodo obtenerValor(){

		if(inicio == null){
			return null;
		}else{
			Nodo nodo = inicio;
			inicio = inicio.getSiguiente();
			return nodo;
		}
	}
	
	public void mostrar(){
		String datos ="";
		Nodo puntero = inicio;
		while(puntero!=null){
			datos += puntero.getDato()+"\n";
			puntero = puntero.getSiguiente();
		}
		System.out.println(datos);
	}
}
	

	

