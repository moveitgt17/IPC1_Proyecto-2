package Usuarios;

import Clases.Enterprise;
import Clases.Producto;
import Interfaces.LogIn;
import TDA.NodoLCD2;
import TDA.NodoLCS;
import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Todo extends JFrame {

    JScrollPane j;
    JPanel is = new JPanel();
    public int contador;
    public JLabel nombre = new JLabel();
    JLabel titulo, oferta;
    JButton carrito, salir, regresar;
    NodoLCS aux = Enterprise.circularList.inicio;

    public Todo() {
        init();

    }

    public void imagen() {
        for (int x = 0; x < Enterprise.circularList.contador; x++) {
            for (int z = 0; z < 10; z++) {
                String nom = aux.producto.getNombre();
                String precioViejo = String.valueOf(aux.producto.getPrecio());
                String direccion = aux.producto.getDireccion();
                String descripcio = aux.producto.getDescripcion();
                if (contador < Enterprise.circularList.contador) {
                    JPanel s = new JPanel();
                    s.setLayout(null);
                    s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
                    JButton agregar = new JButton();
                    JLabel imagen = new JLabel();
                    JLabel precioa = new JLabel();
                    JLabel name = new JLabel();
                    JLabel descripcion = new JLabel();
                    JLabel precion = new JLabel();
                    JLabel prea = new JLabel();
                    JLabel pren = new JLabel();
                    JLabel posiscion = new JLabel();
                    posiscion.setText(Integer.toString(contador + 1));
                    //int ojala = Integer.parseInt(posiscion.getText());
                    //System.out.println(ojala);

                    name.setText(nom);
                    name.setBounds(115, 125, 100, 30);

                    s.setBounds(265 * z, 280 * x, 265, 280);
                    agregar.setBounds(50, 240, 180, 30);
                    agregar.setText("Agregar al carrito");
                    agregar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Producto agregado = Enterprise.circularList.buscarNodo(name.getText());
                            if (e.getSource() == agregar) {
                                String p = name.getText();
                                System.out.println("");
                                System.out.println(Enterprise.circularList.buscarNodo(p).toString());
                                Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.ingresar(agregado);
                                System.out.println("");
                             
                                Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.imprimir();
                                JOptionPane.showMessageDialog(null, "Producto añadido al carro de compras");
                                carrito.setText("Ver carrito(" + Enterprise.simpleList.buscarTodo2(nombre.getText()).carrito.tamaño
                                + ") Q" + total());
                                
                            }
                        }
                    });

                    String ruta = direccion;
                    imagen.setBounds(80, 10, 110, 110);
                    ImageIcon image = new ImageIcon(ruta);
                    Icon icono = new ImageIcon(image.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
                    imagen.setIcon(icono);

                    descripcion.setText(descripcio);
                    descripcion.setBounds(10, 200, 200, 30);

                    precioa.setText("Precio");
                    precioa.setBounds(25, 170, 100, 30);

                    prea.setText(precioViejo);
                    prea.setBounds(65, 170, 70, 30);

                    s.add(descripcion);
                    s.add(prea);
                    s.add(precion);
                    s.add(precioa);
                    s.add(name);
                    s.add(agregar);
                    s.add(imagen);
                    // s.setVisible(true);
                    this.is.add(s);
                    aux = aux.siguiente;
                    contador++;

                }

            }
        }
    }

    public void init() {
        this.setBounds(0, 0, 800, 700);
        nombre.setBounds(10, 10, 100, 25);
        this.add(nombre);

        titulo = new JLabel();
        titulo.setText("AMAUSAC");
        titulo.setFont(new Font("Andale Mono", 3, 24));
        titulo.setForeground(new Color(0, 0, 0));
        titulo.setBounds(290, 40, 200, 35);

        oferta = new JLabel();
        oferta.setBounds(330, 80, 130, 30);
        oferta.setText("Productos");

        salir = new JButton();
        salir.setText("Cerrar sesion");
        salir.setBounds(565, 10, 200, 30);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == salir) {

                    LogIn b = new LogIn();
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                    setVisible(false);
                }
            }
        });

        carrito = new JButton();
        carrito.setText("Ver carrito(0)Q0.0");
        carrito.setBounds(565, 50, 200, 30);
        carrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == carrito) {

                    MostrarGraphiz b = new MostrarGraphiz();
                    b.nombre.setText(nombre.getText());
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                    setVisible(false);
                }
            }
        });


        regresar = new JButton();
        regresar.setText("Modificar Perfil");
        regresar.setBounds(10, 45, 200, 30);
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == regresar) {
                    setVisible(false);
                    Modificar b = new Modificar();
                    b.setBounds(0, 0, 800, 700);
                    b.nombre.setText(nombre.getText());
                    b.setResizable(false);
                    b.setLocationRelativeTo(null);
                    b.setVisible(true);
                    setVisible(false);
                }
            }
        });

      
        this.add(salir);
        this.add(carrito);
        this.add(regresar);
        this.add(titulo);
        this.add(oferta);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        j = new JScrollPane();
        j.setBounds(20, 150, 745, 500);
        j.setViewportView(is);
        is.setLayout(null);
        imagen();

        System.out.println(contador);
        this.add(j);
        is.setPreferredSize(new Dimension(2700, 300 * contador / 10));
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

}
