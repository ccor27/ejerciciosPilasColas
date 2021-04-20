package puntoCuatro;

public class Cola {

	private Nodo inicio,fin;
	
	public Cola(){
		inicio = null;
	}
	
	public void insertar(int dato){
		Nodo nodo = new Nodo(dato);
		if(inicio == null){
			inicio = nodo;
		}else{
			fin.setSiguiente(nodo);
		}
		fin = nodo;
	}
	
	public void mostrar(){
		Nodo puntero = inicio;
		String datos ="";
		while(puntero!=null){
			datos+=puntero.getDato()+"\n";
			puntero = puntero.getSiguiente();
		}
		System.out.println(datos);
	}
}
