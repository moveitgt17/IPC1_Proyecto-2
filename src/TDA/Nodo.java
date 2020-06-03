package TDA;

import Clases.Factura;

public class Nodo {
    public Nodo siguiente;
    public Factura factura;

    public Nodo() {
        siguiente = null;
    }
    
    public Nodo(Factura factura){
        this.factura = factura;
        siguiente = null;
    }
    
    
   
}
