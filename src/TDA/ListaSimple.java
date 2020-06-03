package TDA;

import Clases.Usuario;

public class ListaSimple {

    private NodoLS inicio;
    private int contador;

    public ListaSimple() {
        inicio = null;
        this.contador = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregar(Usuario user) {
        NodoLS nuevo = new NodoLS();
        nuevo.posicion++;
        nuevo.setUser(user);
        if (inicio == null) {
            this.inicio = nuevo;
            this.contador++;
        } else {
            NodoLS aux = this.inicio;
            nuevo.posicion++;
            while (aux.getSiguiente() != null) {
                nuevo.posicion++;
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);

            this.contador++;
        }
    }

    public void imprimir() {
        NodoLS aux = this.getInicio();
        while (aux != null) {
            System.out.println(aux.getUser().toString());
            aux = aux.getSiguiente();
        }
    }

    public void eliminar(String nombre, String user) {
        if (inicio == null) {
            System.out.println("La lista esta vacia");
        } else if (inicio.getSiguiente() == null && inicio.getUser().getName().equals(nombre)) {
            inicio = null;
        } else if (inicio.getSiguiente() != null) {
            NodoLS aux = this.inicio;
            NodoLS sig = this.inicio.getSiguiente();
            while (sig != null && !sig.getUser().getName().equals(nombre)) {
                aux = aux.getSiguiente();
                sig = sig.getSiguiente();
            }
            if (sig != null) {
                aux.setSiguiente(null);
                aux.setSiguiente(sig.getSiguiente());

            }
        }
    }

    public String buscar(String nombre) {

        NodoLS aux = this.inicio;

        while (aux != null && !aux.getUser().getName().equals(nombre)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().toString();
        } else {
            return "No existe ningun usuario con ese nombre";
        }

    }

    public String buscarTodo(int posicion) {

        NodoLS aux = this.inicio;

        while (aux != null && aux.posicion != posicion) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().toString();
        } else {
            return "No existe ningun usuario con ese nombre";
        }

    }

    public String buscarNombre(int posicion) {

        NodoLS aux = this.inicio;
        while (aux != null && aux.posicion != posicion) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().getName();
        }
        return "No existe ningun usuario con ese nombre";
    }

    public String buscarEmail(int posicion) {

        NodoLS aux = this.inicio;

        while (aux != null && aux.posicion != posicion) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().getEmail();
        } else {
            return "No existe ningun usuario con ese nombre";
        }

    }

    public String buscarTipo(int posicion) {

        NodoLS aux = this.inicio;

        while (aux != null && aux.posicion != posicion) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().getType();
        } else {
            return "No existe ningun usuario con ese nombre";
        }

    }

    public boolean buscarDos(String nombre, String user, String email) {

        NodoLS aux = this.inicio;

        while (aux != null && !aux.getUser().getName().equals(nombre)
                && !aux.getUser().getEmail().equals(email) && !aux.getUser().getUserr().equals(user)) {
            aux = aux.getSiguiente();
        }
        return aux != null;
    }

    public NodoLS getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoLS inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    public Usuario buscarTodo2(String nombree) {

        NodoLS aux = this.inicio;

        while (aux != null && !aux.getUser().getName().equals(nombree)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser();
        } else {
            return null;
        }

    }

    public boolean ultimoBuscar(String nombree) {

        NodoLS aux = this.inicio;

        while (aux != null && !aux.getUser().getName().equals(nombree)) {
            aux = aux.getSiguiente();
        }
        return aux != null;
    }
    
     public String buscarTodo3(String usuario) {

        NodoLS aux = this.inicio;

        while (aux != null && !aux.getUser().getUserr().equals(usuario)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().getName();
        } else {
            return null;
        }

    }
     
     public String buscarTarjet(String posicion) {

        NodoLS aux = this.inicio;
        while (aux.getSiguiente() != null && !aux.getUser().getName().equals(posicion)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return Integer.toString(aux.getUser().getCard());
        }
        return "No existe ningun usuario con ese nombre";
    }
     
      public String buscarE(String posicion) {

        NodoLS aux = this.inicio;
        while (aux.getSiguiente() != null && !aux.getUser().getName().equals(posicion)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getUser().getEmail();
        }
        return "No existe ningun usuario con ese nombre";
    }
      
      public Usuario busNodo(String nombre){
          NodoLS actual = inicio;
          boolean encontrado = false;
          if(estaVacia()){
              return null;
          }
          while(actual.getSiguiente()!=null && !encontrado){
              encontrado = actual.getUser().getName().equals(nombre);
              if(!encontrado){
                  actual = actual.getSiguiente();
              }
          }
          encontrado = actual.getUser().getName().equals(nombre);
          if(encontrado){
              return actual.getUser();
          }else{
              return null;
          }
      }
      
       public void modificar(Usuario p) {
         NodoLS actual = inicio;
         boolean encontrado = false;
         while(actual.getSiguiente()!=null &&!encontrado){
             encontrado = actual.getUser().getName().equals(p.getName());
             if(!encontrado){
                 actual = actual.getSiguiente();
             }
         }
         actual.setUser(p);
    }
      
      

}
