package puntoCuatro;

import java.util.ArrayList;

/**
 * Se tiene una pila de enteros positivos. 
 * Con las operaciones básicas de pilas y colas escribir un fragmento de código 
 * para poner todos los elementos que son par de la pila en la cola.
 * @author crist
 *
 */

public class Main {

	public static void main(String args[]){
		
		Pila pila = new Pila();
		
		pila.insertar(1);
		pila.insertar(2);
		pila.insertar(3);
		pila.insertar(4);
		pila.insertar(5);
		pila.insertar(6);
		pila.mostrar();
		pila = elegirPares(pila);
		System.out.println("la pila: ");
		pila.mostrar();
	}
	
	public static Pila elegirPares( Pila pila){
		ArrayList<Integer> noPares = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
        Nodo nodo = pila.obtenerValor();
        while(nodo!=null){
        	if(nodo.getDato()%2==0){
        		pares.add(nodo.getDato());
        	}else{
        		noPares.add(nodo.getDato());
        	}
        	
        	nodo = pila.obtenerValor();
        	
        }
        
        //ingreso los impares a la pila
        for (int i = 0; i <noPares.size(); i++) {
			pila.insertar(noPares.get(i));
		}
        
        Cola cola = new Cola();
        for (int i = 0; i <pares.size(); i++) {
			cola.insertar(pares.get(i));
		}
       System.out.println("la cola: ");
       cola.mostrar();

        return pila;
	}
}
