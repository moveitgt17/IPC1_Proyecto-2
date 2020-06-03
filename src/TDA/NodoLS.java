package TDA;

import Clases.Usuario;

public class NodoLS {
    private NodoLS siguiente;
    public int posicion;
    private Usuario user;


    public NodoLS() {
        

    }
    
    public NodoLS(Usuario u){
        this.user = u;
        this.siguiente = null;
        posicion = 0;
    }

    /**
     * @return the siguiente
     */
    public NodoLS getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
    }
    

    
}
