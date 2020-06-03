package Interfaces;

import Clases.Enterprise;
import TDA.NodoLS;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import org.jfree.data.general.DefaultPieDataset;

public class Cinco {

    public Cinco() {
        if(!Enterprise.usuariosCancelan.estaVacia()){
        DefaultPieDataset data = new DefaultPieDataset();
        if(Enterprise.usuariosCancelan.getContador()<5){
               for (NodoLS aux = Enterprise.usuariosCancelan.getInicio(); aux != null; aux = aux.getSiguiente()) {
                   final String VID = aux.getUser().getName();
                   data.setValue(VID, aux.getUser().cancelaciones);
               }
        }else{
            NodoLS aux2 = Enterprise.usuariosCancelan.getInicio();
                for(int i=0; i<5; i++){
                        final String VID = aux2.getUser().getName();
                   data.setValue(VID, aux2.getUser().cancelaciones);
                     aux2 = aux2.getSiguiente();
                }
        }
        
      

        JFreeChart grafica = ChartFactory.createPieChart("5 Usuarios con más cancelaciones", data, true, true, false);

        ChartPanel contenedor = new ChartPanel(grafica);
        contenedor.setBounds(5, 50, 300, 300);
        Test t = new Test();
        t.add(contenedor);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No se han realizado cancelaciones");
        }
       
    }

    public static void main(String[] args) {
        new Cinco();
    }

}
