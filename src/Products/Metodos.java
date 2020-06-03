package Products;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Metodos {
    
     public String SeleccionarArchivo(String Filtro_Archivo) {
        try {
            JFileChooser JfC = new JFileChooser();
            JfC.setAcceptAllFileFilterUsed(false);
            JfC.setFileFilter(new FileNameExtensionFilter("Archivos con extension *." + Filtro_Archivo, Filtro_Archivo));
            JfC.setCurrentDirectory(new File("Escritorio"));
            JfC.showOpenDialog(null);
            String ruta = JfC.getSelectedFile().getAbsolutePath();
            return ruta;
        } catch (Exception E) {
            System.err.println("Error al abrir el archivo");
            return "";
        }
    }
     
     public String ObtenerContenidoArchivo(String Ruta) {
        String aux = "";
        String texto = "";
        try {
            File Archivo = new File(Ruta);
            if (Archivo != null) {
                Ruta = "" + Archivo;
                FileReader FR = new FileReader(Archivo);
                try (BufferedReader Buffer = new BufferedReader(FR)) {
                    while ((aux = Buffer.readLine()) != null) {
                        texto += aux + "\n";
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + "" + "\nNo se ha podido leer el archivo", "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;
    }
}
