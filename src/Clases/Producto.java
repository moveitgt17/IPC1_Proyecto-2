package Clases;

public class Producto {
    private int identificador;
    private String nombre, descripcion;
    private double precio;
    private int existencia;
    private String direccion;

    public Producto() {
    }

    public Producto( String nombre, String descripcion, double precio, int existencia, String direccion) {
        this.identificador = 0;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
        this.direccion = direccion;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Producto{" + "identificador=" + identificador + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", existencia=" + existencia + ", direccion=" + direccion + '}';
    }
    
    
}
