package Clases;

import TDA.ListaCircular;

public class Oferta {
    
    private String descripcion;
    private double descuento;
    private ListaCircular productos;
    private String prioridad;
    public Oferta() {
        
    }

    public Oferta(String descripcion, double descuento, ListaCircular productos, String prioridad) {
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.productos = productos;
        this.prioridad = prioridad;
 
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the productos
     */
    public ListaCircular getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ListaCircular productos) {
        this.productos = productos;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        
        return "Oferta{"  + "descripcion=" + descripcion + ", descuento=" + descuento + ", productos=" + productos.toString() + ", prioridad=" + prioridad + '}';
    }

    /**
     * @return the identificador
     */
 
    
    
}
