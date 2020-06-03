package TDA;

import Clases.Producto;
import java.io.FileWriter;
import java.io.IOException;

public class ListaCircularDoble2 {
    public NodoLCD2 primero;
    public int tamaño;

    public ListaCircularDoble2() {
        tamaño = 0;
        primero = null;
    }
    
    public void ingresar(Producto x){
        NodoLCD2 nuevo = new NodoLCD2();
       
        nuevo.dato = x;
         nuevo.dato.setIdentificador(tamaño+1);
        if(estaVacia()){
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = primero;
            tamaño++;
        }else{
            NodoLCD2 aux = primero;
             while (aux.siguiente != primero) {
                aux = aux.siguiente;
            }
             aux.siguiente = nuevo;
             nuevo.siguiente = primero;
             nuevo.anterior = aux;
             aux = nuevo;
             primero.anterior = aux;
             tamaño++;
        }
    }
    
    public boolean estaVacia(){
        return primero==null;
    }
    
    public void imprimir(){
       
        NodoLCD2 actual = primero;
      if(!estaVacia()){
           do{
            System.out.println(actual.dato);
            actual = actual.siguiente;  
        }while(actual!=primero);
      }else{
          System.out.println("La lista esta vacia");
      }
       
    
    }
    
    public void buscar(String x){
       NodoLCD2 aux = primero;
       boolean encontrado = false;
       if(estaVacia()){
           System.out.println("Lista Vacia");
       }else{
          while (aux.siguiente!=primero){
            aux = aux.siguiente; 
       }

           NodoLCD2 actual = aux;
           do {
               if(actual.dato.getNombre().equals(x)){
                   encontrado = true;
               }
               actual = actual.anterior;
           } while (actual != aux);
           
           if(encontrado){
               System.out.println("nodo encontrado");
           }else{
               System.out.println("nodo no encontrado");
           }
       }
       
    }
    
    public Producto buscarProducto(int x){
          NodoLCD2 aux = primero;
       boolean encontrado = false;
       if(estaVacia()){
           System.out.println("Lista Vacia");
       }else{
          while (aux.siguiente!=primero){
            aux = aux.siguiente; 
       }

           NodoLCD2 actual = primero;
           do {
               actual = actual.anterior;
           } while (actual.dato.getIdentificador()!=x);
           encontrado = actual.dato.getIdentificador() ==x;
           if(encontrado){
               return actual.dato;
           }else{
               System.out.println("Nodo encontrado"); 
           }
           
       }
       return null;
    }
    
    public void GenerarGrafico()throws IOException{
        int contador = 1;
        NodoLCD2 aux = primero;
        FileWriter j = new FileWriter("C:\\Users\\CARLOS\\Desktop\\prueba.txt");
        j.write("digraph D{" + "\n");
        j.write("rankdir=LR" + "\n");
        j.write("node [fontname=\"Arial\"];" + "\n");
        for(int i=0; i<tamaño;i++){
            j.write(aux.dato.getNombre() + ":f" + tamaño + "->" + aux.siguiente.dato.getNombre() + ":f" + 0 + "\n");
            j.write(aux.siguiente.dato.getNombre()+ ":f" + String.valueOf(contador-1)+ "->" + aux.dato.getNombre() + ":f" + 0 + "\n");
            aux = aux.siguiente;
            contador++;
        }
        j.close();
    }
 
}
