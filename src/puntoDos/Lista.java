package puntoDos;

public class Lista {


	private Nodo inicio;
	private Nodo inicioClon;
	
	public Lista(){
		inicio = null;
	}
	
	public void insertar(int dato){
		Nodo nodo = new Nodo(dato);
		if(inicio == null){
			inicio = nodo;
		}else{
			Nodo puntero = inicio;
			while(puntero.getSiguiente()!=null){
			    puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nodo);
		}
	}
	

    public Nodo obtenerNodo(){
	  Nodo aux = inicio;
      if(aux!=null){
    	  inicio = inicio.getSiguiente();
    	  return aux;
      }else{
    	  return null;
      }
	  
    }
    public void duplicarLista(){
        inicioClon = inicio;
    }
    
    public String mostrarLista(){
    	String datos = "";
    	Nodo puntero = inicioClon;
    	while(puntero!=null){
    		datos += puntero.getDato()+" ";
    		puntero = puntero.getSiguiente();
    	}
    	return datos;
    }
}
