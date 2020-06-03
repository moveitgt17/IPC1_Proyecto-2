package TDA;

import Clases.Enterprise;
import Clases.Oferta;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PriorityQueue {

   public  NodoP inicio;
    public int contador;

    public PriorityQueue() {
        inicio = null;
        contador = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertar(Oferta d) {
        NodoP nuevo = new NodoP();
        nuevo.dato.getDescuento();
      
        nuevo.dato = d;
        if (estaVacia()) {
            inicio = nuevo;
            
            inicio.siguiente = null;
         
            contador++;
        } else {
            if (prioridad(nuevo)) {
                NodoP aux = inicio;
                int iterador = 0;
                while (prioridad(aux)) {
                    aux = aux.siguiente;
                    iterador++;
                }
                NodoP aux2 = inicio;
                for (int i = 0; i < iterador - 1; i++) {
                    aux2 = aux2.siguiente;
                }
                aux2.siguiente = nuevo;
                nuevo.siguiente = aux;

                contador++;
            } else {
                NodoP aux = inicio;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                nuevo.siguiente = null;
                contador++;
            }
        }
    }

    public boolean prioridad(NodoP nuevo) {

        // while(aux.dato.getPrioridad().equals("alta")){
        //}
        return nuevo.dato.getPrioridad().equalsIgnoreCase("alta"); //Condición para ver si cumple la prioridad
        //En tu caso sería ver si cumple con la condición que te hayan puesto.
    }

    public void imprimir() {
        NodoP aux = inicio;
        while (aux != null) {
            System.out.println(aux.dato.toString());
            aux = aux.siguiente;
        }

    }

    public void agregar(Oferta d) {
        NodoP nuevo = new NodoP(d);

        if (prioridad(nuevo)) {
            if (estaVacia()) {
                inicio = nuevo;
                inicio.siguiente = null;
                contador++;
            } else {
                if (prioridad(inicio)) {

                    NodoP aux = inicio.siguiente;
                    NodoP aux1 = inicio;

                    while (prioridad(aux)) {
                        aux = aux.siguiente;
                        aux1 = aux1.siguiente;
                    }
                    aux1.siguiente = nuevo;
                    nuevo.siguiente = aux;
                    contador++;
                } else {

                    nuevo.siguiente = inicio;
                    inicio = nuevo;
                    contador++;
                }
            }
        } else {
            if (estaVacia()) {
                inicio = nuevo;
                inicio.siguiente = null;
                contador++;
            } else {
                NodoP aux = inicio;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                nuevo.siguiente = null;
                contador++;
            }
        }
    }

    public void eliminar(String descripcion) {
        NodoP aux = inicio;
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else if (inicio.siguiente == null && inicio.dato.getDescripcion().equals(descripcion)) {
            inicio = null;
            contador--;
        } else if (inicio.siguiente != null && inicio.dato.getDescripcion().equals(descripcion)) {
            inicio = inicio.siguiente;
            aux = null;
            contador--;
        } else {
            NodoP sig = inicio.siguiente;
            while (sig != null && !sig.dato.getDescripcion().equals(descripcion)) {
                aux = aux.siguiente;
                sig = sig.siguiente;
            }
            if (sig != null) {
                aux.siguiente = null;
                aux.siguiente = sig.siguiente;
                contador--;
            }
        }
    }
    
     

}
