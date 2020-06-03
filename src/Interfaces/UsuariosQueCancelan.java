package Interfaces;

import java.io.IOException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class UsuariosQueCancelan {
  
    
    public void crearPDF(String destino)throws IOException{
        try{
            Document documento = new Document();
            PdfPTable table = new PdfPTable(4);
            table.completeRow();
            table.addCell("ID");
            table.addCell("Repuesto");
            table.addCell("Existencias");
            table.completeRow();
            PdfWriter.getInstance(documento, new FileOutputStream("repuesto.pdf"));
            documento.open();
            documento.add(table);
            documento.close();
            System.out.println("Done");
            File pdfFile = new File("repuestos.pdf");
            if(pdfFile.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(pdfFile);
                }else{
                    System.out.println("Problems");
                }
            }else{
                System.out.println("File not");
            }
            System.out.println("DONE");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}
