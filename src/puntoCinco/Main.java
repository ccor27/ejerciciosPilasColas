package puntoCinco;

import java.util.ArrayList;

/**
 * Eliminar un elemento de la pila dado su valor.
 * @author crist
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		
		pila.insertar(1);
		pila.insertar(2);
		pila.insertar(3);
		pila.insertar(4);
		pila.insertar(5);
		pila.insertar(6);
		pila.mostrar();
		pila = eliminarDatoDeter(4, pila);
		pila.mostrar();
		


	}

	public static Pila eliminarDatoDeter(int dato, Pila pila){
		ArrayList<Integer> temp = new ArrayList<>();
        Nodo nodo = pila.obtenerValor();
        while(nodo!=null){
        	if(nodo.getDato()==dato){
        		break;
        	}else{
        	temp.add(nodo.getDato());

        	nodo = pila.obtenerValor();
        	}
        }
        
        for (int i = 0; i <temp.size(); i++) {
			pila.insertar(temp.get(i));
		}

        return pila;
	}
}
