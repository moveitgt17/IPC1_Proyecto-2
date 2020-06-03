package TDA;

import Clases.Factura;

public class Pila {
    public Nodo inicio;
    public int tamaño;

    public Pila() {
        inicio = null;
        tamaño = 0;
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public void añadirR(Factura factura) {
        Nodo nuevo = new Nodo(factura);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        tamaño++;
    }
    
     public void imprimir() {
         if(!estaVacia()){
             Nodo actual;
        for (actual = inicio; actual != null; actual = actual.siguiente) {
            System.out.println(actual.factura.toString());
         }
        
        }else{
             System.out.println("lista vacia");
         }

    }
     
     public Factura buscar(String nombre){
         Nodo actual = inicio;
         boolean encontrado = false;
         while(actual.siguiente!=null&&!encontrado){
             encontrado = actual.factura.getNombre().equals(nombre);
             if(!encontrado){
                 actual = actual.siguiente;
             }
         }
         encontrado = actual.factura.getNombre().equals(nombre);
         if(encontrado){
             return actual.factura;
         }else{
             return null;
         }
     }
    
    
}
