/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Clases.Enterprise;
import Clases.Graphiz;
import TDA.NodoLCD2;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLOS
 */
public class MostrarGraphiz extends javax.swing.JFrame {

    /**
     * Creates new form MostrarGraphiz
     */
    public MostrarGraphiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pagar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jButton1.setText("Mostrar Graphviz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nombre.setText("Nombre");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ventana Principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total a Pagar:");

        pagar.setText("pagar");

        jLabel3.setText("Total de Productos:");

        TP.setText("Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(pagar)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(TP)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagar)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Enterprise.simpleList.busNodo(nombre.getText()).carrito.GenerarGrafico();
        } catch (IOException ex) {
            Logger.getLogger(MostrarGraphiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        Graphiz g = new Graphiz();
        g.cualquier();
        
        System.out.println(" holaaaa");
        System.out.println("");
        String ruta = "C:\\Users\\CARLOS\\Desktop\\CHINGAA.jpg";
        Desktop abrir;
        File file = new File(ruta);
        if (Desktop.isDesktopSupported()) {
            abrir = Desktop.getDesktop();
            try {
                abrir.open(file);
            } catch (IOException exx) {
                exx.getStackTrace();
            }
        } else {
            System.out.println("No");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        I i = new I();
        i.setBounds(0, 0, 800, 700);
        i.nombre.setText(nombre.getText());
        i.setResizable(false);
        i.setLocationRelativeTo(null);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Carrito b = new Carrito();
        String tarjet = Enterprise.simpleList.buscarTarjet(nombre.getText());
        String es = Enterprise.simpleList.buscarE(nombre.getText());

        b.nombre.setText(nombre.getText());
        b.dueno.setText(es);
        b.tarjeta.setText(tarjet);
        b.setResizable(false);
        b.setLocationRelativeTo(null);
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if(!Enterprise.simpleList.busNodo(nombre.getText()).carrito.estaVacia()){
                 tabla();
        pagar.setText(String.valueOf(total()));
        TP.setText(Integer.toString(Enterprise.simpleList.busNodo(nombre.getText()).carrito.tamaño)); 
        }else{
            pagar.setText("0.00");
            TP.setText("0");
            tabla();
        }
  
    }//GEN-LAST:event_formMouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String name = nombre.getText();
        if (!Enterprise.simpleList.buscarTodo2(name).carrito.estaVacia()) {
            if (!Enterprise.usuariosCancelan.ultimoBuscar(name)) {
                Enterprise.usuariosCancelan.agregar(Enterprise.simpleList.buscarTodo2(name));
            }
            Enterprise.usuariosCancelan.buscarTodo2(name).cancelaciones++;
            JOptionPane.showMessageDialog(null, "La compra ha sido cancelada");
            System.out.println("");
            System.out.println("Hola");
            Enterprise.usuariosCancelan.imprimir();
            Enterprise.simpleList.buscarTodo2(name).carrito.primero = null;
             Enterprise.simpleList.buscarTodo2(name).carrito.tamaño = 0;
            Enterprise.simpleList.buscarTodo2(name).carrito.imprimir();
            System.out.println("holaaaaaaaaaaaaaaaa");
            Enterprise.simpleList.buscarTodo2(name).toString();
            System.out.println("");
            System.out.println(Enterprise.usuariosCancelan.buscarTodo2(name).cancelaciones);
            tabla();
        }else{
            JOptionPane.showMessageDialog(null, "Tu carro de compras esta vacio, no hay productos para cancelar la compra");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarGraphiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarGraphiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarGraphiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarGraphiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarGraphiz().setVisible(true);
            }
        });
    }
    
    public void tabla() {
        String nombreColumnas[] = {"Nombre", "Descripcion", "Precio"};
        String data[][] = new String[Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.tamaño][3];
        if (!Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.estaVacia()) {
            for (int i = 0; i < Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.tamaño; i++) {
                data[i][0] = Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.buscarProducto(i + 1).getNombre();
                data[i][1] = Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.buscarProducto(i + 1).getDescripcion();
                data[i][2] = String.valueOf(Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.buscarProducto(i + 1).getPrecio());
            }
        }
        jTable1.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    public double total() {
        double total = 0;
        NodoLCD2 aux = Enterprise.simpleList.busNodo(nombre.getText()).carrito.primero;
        for (int i = 0; i < Enterprise.simpleList.busNodo(nombre.getText()).carrito.tamaño; i++) {

            total = total + aux.dato.getPrecio();
            aux = aux.siguiente;
        }
        return total;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel TP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel nombre;
    public javax.swing.JLabel pagar;
    // End of variables declaration//GEN-END:variables
}
