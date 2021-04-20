package puntoDos;

public class Pila {

	private Nodo inicio, fin;
	
	public Pila(){
		inicio = null;
		fin = null;
	}
	
	public void insetar(int dato){
		Nodo nodo = new Nodo(dato);
		if(inicio == null){
			inicio = nodo;
		}else{
			fin.setSiguiente(nodo);
		}
		fin = nodo;
		//System.out.println("inserto en la pila");
	}
	
	public String mostrarPila(){
		String datos="";
		Nodo puntero = inicio;
		while(puntero!=null){
			datos +=puntero.getDato()+"\n";
			puntero = puntero.getSiguiente();
		}
		return datos;
	}
}
