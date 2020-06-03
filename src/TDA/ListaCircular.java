package TDA;

import Clases.Producto;

public class ListaCircular {

   public NodoLCS inicio;
    public int contador;

    public ListaCircular() {
        inicio = null;
        contador = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void imprimir() {
        NodoLCS aux = inicio;
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else if (inicio.siguiente == inicio) {
            System.out.println("dato:[" + inicio.producto.toString() + "]");
        } else {
            System.out.println("Prueba: [" + aux.producto.toString() + "]");
            while (aux.siguiente != inicio) {
                aux = aux.siguiente;
                System.out.println("Prueba: [" + aux.producto.toString() + "]");
            }
        }
    }

    public void modificar(Producto p) {
         NodoLCS actual = inicio;
         boolean encontrado = false;
         while(actual.siguiente!=inicio &&!encontrado){
             encontrado = actual.producto.getIdentificador()==p.getIdentificador();
             if(!encontrado){
                 actual = actual.siguiente;
             }
         }
         actual.producto = p;
    }

    public void eliminar(String nombre) {
       
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.siguiente.producto.getNombre().equals(nombre);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.siguiente.producto.getNombre().equals(nombre);
        if (encontrado) {
            NodoLCS aux = actual.siguiente;
            if (inicio.equals(inicio.siguiente)) {
                inicio = null;
            } else {
                if (aux.equals(inicio)) {
                    inicio = actual;
                }
                actual.siguiente = aux.siguiente;
            }
            aux = null;
            contador--;
        }

    }

    public String search(String nombre) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "Lista vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getNombre().equals(nombre);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        if (!actual.producto.getNombre().equals(nombre)) {
            return "No se encontro";
        }
        return actual.producto.toString();

    }

    public boolean bus(String nombre) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return false;
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getNombre().equals(nombre);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getNombre().equals(nombre);
        return encontrado;

    }

    public void inserta(Producto p) {
        NodoLCS nuevo = new NodoLCS(p);
        contador++;
        nuevo.producto.setIdentificador(contador);
        if (estaVacia()) {
            nuevo.siguiente = inicio;

            inicio = nuevo;
            inicio.siguiente = inicio;
        } else if (inicio != null) {
            nuevo.siguiente = inicio;
            int iteracion = 1;
            NodoLCS aux = inicio;
            while (iteracion != contador - 1) {
                aux = aux.siguiente;
                iteracion++;

            }

            aux.siguiente = nuevo;
        }
    }

    public String buscarNombre(int ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "La lista esta vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getIdentificador() == ID;
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getIdentificador() == ID;
        if (encontrado) {
            return actual.producto.getNombre();
        } else {
            return "No se encontro ningun producto";
        }
    }

    public String buscarPrecio(int ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "La lista esta vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getIdentificador() == ID;
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getIdentificador() == ID;
        if (encontrado) {
            return String.valueOf(actual.producto.getPrecio());
        } else {
            return "No se encontro ningun producto";
        }
    }

    public String buscarStock(int ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "La lista esta vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getIdentificador() == ID;
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getIdentificador() == ID;
        if (encontrado) {
            return Integer.toString(actual.producto.getExistencia());
        } else {
            return "No se encontro ningun producto";
        }
    }

    public void elim(String nombre) {
        NodoLCS aux = inicio;
        NodoLCS actual = inicio.siguiente;
        boolean encontrado = false;
        if (estaVacia()) {
            System.out.println("Lita Vacia");
        } else if (inicio.siguiente == inicio) {
            if (inicio.producto.getNombre().equals(nombre)) {
              inicio = null;
                contador--;
            } else {
                System.out.println("No existe ningun producto con ese nombre");
            }
        }
        else {
            while (actual != inicio && !encontrado) {
                encontrado = actual.producto.getNombre().equals(nombre);
                if (!encontrado) {
                    actual = actual.siguiente;
                    aux = aux.siguiente;
                }
            }
            encontrado = actual.producto.getNombre().equals(nombre);
            if (encontrado) {
                aux.siguiente = actual.siguiente;
                while (aux.siguiente != inicio) {
                    int id = aux.siguiente.producto.getIdentificador();
                    id--;
                    aux.siguiente.producto.setIdentificador(id);
                    aux = aux.siguiente;
                }
                actual = null;
                contador--;
            }
        }
    }
   
     public String buscarDire(int ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "La lista esta vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getIdentificador() == ID;
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getIdentificador() == ID;
        if (encontrado) {
            return actual.producto.getDireccion();
        } else {
            return "No se encontro ningun producto";
        }
    }
     
      public String buscarDesc(int ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return "La lista esta vacia";
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getIdentificador() == ID;
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getIdentificador() == ID;
        if (encontrado) {
            return actual.producto.getDescripcion();
        } else {
            return "No se encontro ningun producto";
        }
    }
      
      public Producto buscarNodo(String ID) {
        NodoLCS actual;
        boolean encontrado = false;
        actual = inicio;
        if (estaVacia()) {
            return null;
        }
        while (actual.siguiente != inicio && !encontrado) {
            encontrado = actual.producto.getNombre().equals(ID);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = actual.producto.getNombre().equals(ID);
        if (encontrado) {
    
            return actual.producto;
    
            
        } else {
            return null;
        }
    }
      
    
      

}
