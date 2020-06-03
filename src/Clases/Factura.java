package Clases;


import TDA.ListaCircularDoble2;

public class Factura {

    private int numero;
    private String tipoCompra, nombre;
    private int nit;
    private String tipoCliente, fecha, hora, direccion;
    private int tarjeta;
    private double descuento, subTotal, total;
    private ListaCircularDoble2 productos = new ListaCircularDoble2();

    public Factura() {
    }

    public Factura(int numero, String tipoCompra, String nombre, int nit, String tipoCliente, String fecha, String hora, String direccion, int tarjeta, double descuento, double subTotal, double total) {
        this.numero = numero;
        this.tipoCompra = tipoCompra;
        this.nombre = nombre;
        this.nit = nit;
        this.tipoCliente = tipoCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.descuento = descuento;
        this.subTotal = subTotal;
        this.total = total;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipoCompra
     */
    public String getTipoCompra() {
        return tipoCompra;
    }

    /**
     * @param tipoCompra the tipoCompra to set
     */
    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
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
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
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

    /**
     * @return the tarjeta
     */
    public int getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
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
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", tipoCompra=" + tipoCompra + ", nombre=" + nombre + ", nit=" + nit + ", tipoCliente=" + tipoCliente + ", fecha=" + fecha + ", hora=" + hora + ", direccion=" + direccion + ", tarjeta=" + tarjeta + ", descuento=" + descuento + ", subTotal=" + subTotal + ", total=" + total + '}';
    }

   
   
   
}
