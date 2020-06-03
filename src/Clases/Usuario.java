package Clases;

import TDA.ListaCircularDoble2;

public class Usuario {
    private String name, email, userr, password;
    private int card;
    private String tipoTarjeta;
    private String type;
    public   ListaCircularDoble2 carrito = new ListaCircularDoble2();
    public int cancelaciones;
    public Usuario() {
        
    }

    public Usuario(String name, String email, String user, String password, int card, String tipoTarjeta, String type) {
        this.name = name;
        this.email = email;
        this.userr = user;
        this.password = password;
        this.card = card;
        this.tipoTarjeta = tipoTarjeta;
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the user
     */
    public String getUserr() {
        return userr;
    }

    /**
     * @param user the user to set
     */
    public void setUserr(String user) {
        this.userr = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the card
     */
    public int getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(int card) {
        this.card = card;
    }

    /**
     * @return the tipoTarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * @param tipoTarjeta the tipoTarjeta to set
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", email=" + email + ", user=" + userr + ", password=" + password + ", card=" + card + ", tipoTarjeta=" + tipoTarjeta + ", type=" + type + '}';
    }

    
}
