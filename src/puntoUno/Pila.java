package puntoUno;

public class Pila {

	private Nodo cima;
	
	public Pila(){
		cima = null;
	}
	
	public void insertar(char dato){
		Nodo nodo =  new Nodo(dato);
		if (cima == null) {
			cima = nodo;
		} else {
            cima.setSiguiente(nodo);
            cima = nodo;
		}
	}
	
	public boolean verificarPolindroma(){
		String palabra = "";
		String palabraInvertida="";
		Nodo nodo = cima;
		while(nodo!=null){
			palabra+=nodo.getDato();
			nodo = nodo.getSiguiente();
		}
		
		StringBuilder strb = new StringBuilder(palabra);
		palabraInvertida = strb.reverse().toString();
				
        if (palabra.equalsIgnoreCase("") || palabraInvertida.equalsIgnoreCase("")) {
			return false;
		} else {

			if(palabra.equalsIgnoreCase(palabraInvertida)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public void vaciarCola(){
		cima = null;
	}
}
