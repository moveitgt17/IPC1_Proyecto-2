package Usuarios;

import Clases.Enterprise;
import Interfaces.LogIn;
import TDA.NodoLCS;
import TDA.NodoP;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class I extends JFrame {

    JScrollPane j;
    JPanel is = new JPanel();
    static int contador;
    public JLabel nombre = new JLabel();
    JLabel titulo, oferta;
    JButton modificar, carrito, salir, productos;

    public I() throws HeadlessException {

        nombre.setBounds(10, 10, 100, 25);

        titulo = new JLabel();
        titulo.setText("AMAUSAC");
        titulo.setFont(new Font("Andale Mono", 3, 24));
        titulo.setForeground(new Color(0, 0, 0));
        titulo.setBounds(290, 40, 200, 35);

        oferta = new JLabel();
        oferta.setBounds(330, 80, 130, 30);
        oferta.setText("Ofertas");

        modificar = new JButton();
        modificar.setText("Modificar Datos");
        modificar.setBounds(10, 45, 130, 30);
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == modificar) {
                    setVisible(false);
                    Modificar b = new Modificar();
                    b.setResizable(false);
                    b.nombre.setText(nombre.getText());
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                }
            }
        });

        salir = new JButton();
        salir.setText("Cerrar sesion");
        salir.setBounds(565, 10, 200, 30);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == salir) {
                    setVisible(false);
                    LogIn b = new LogIn();
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                }
            }
        });

        carrito = new JButton();
        carrito.setText("Ver carrito de compras");
        carrito.setBounds(565, 50, 200, 30);
        carrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == carrito) {
                    setVisible(false);
                
                    MostrarGraphiz b = new MostrarGraphiz();
                    b.nombre.setText(nombre.getText());
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                    setVisible(false);
                }
            }
        });

        productos = new JButton();
        productos.setText("Ver todos los productos");
        productos.setBounds(565, 90, 200, 30);
        productos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == productos) {
                    setVisible(false);
                    
                    Todo b = new Todo();
                    b.contador = 0;
                    b.nombre.setText(nombre.getText());
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                }
            }
        });

        this.add(nombre);
        this.add(modificar);
        this.add(salir);
        this.add(carrito);
        this.add(productos);
        this.add(titulo);
        this.add(oferta);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        j = new JScrollPane();
        j.setBounds(20, 150, 745, 500);
        j.setViewportView(is);
        is.setLayout(null);
        //System.out.println(Enterprise.productoOferta.contador);
        for (int x = 0; x < 5; x++) {
            for (int z = 0; z < 4; z++) {

                JPanel s = new JPanel();
                s.setLayout(null);
                s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
                JButton agregar = new JButton();
                JLabel imagen = new JLabel();
                JLabel precioa = new JLabel();
                JLabel name = new JLabel();
                JLabel precion = new JLabel();
                JLabel prea = new JLabel();
                JLabel pren = new JLabel();
                s.setBounds(265 * z, 280 * x, 265, 280);
                agregar.setBounds(50, 240, 180, 30);
                agregar.setText("Agregar al carrito");

                String ruta = "C:\\Users\\CARLOS\\Documents\\img\\img (1).png";
                imagen.setBounds(80, 10, 110, 110);
                ImageIcon image = new ImageIcon(ruta);
                Icon icono = new ImageIcon(image.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
                imagen.setIcon(icono);

                name.setText("Prueba");
                name.setBounds(115, 125, 100, 30);

                precioa.setText("Precio anterior");
                precioa.setBounds(25, 170, 100, 30);

                precion.setText("Precio nuevo");
                precion.setBounds(155, 170, 100, 30);

                prea.setText("p1");
                pren.setText("p2");
                prea.setBounds(45, 190, 70, 30);
                pren.setBounds(175, 190, 70, 30);

                s.add(prea);
                s.add(pren);
                s.add(precion);
                s.add(precioa);
                s.add(name);
                s.add(agregar);
                s.add(imagen);
                s.setVisible(true);
                this.is.add(s);
                contador++;
            }
        }
        this.add(j);
        is.setPreferredSize(new Dimension(7000, 5000));
    }

}
