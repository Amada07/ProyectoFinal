/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeventas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Amada
 */
public class ProductosDb {
 public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Panel de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear un botón para crear el producto
        JButton crearProductoBtn = new JButton("Crear Producto");
        crearProductoBtn.addActionListener(e -> crearProducto());

        // Agregar el botón al panel
        panel.add(crearProductoBtn);

        // Agregar el panel al marco
        frame.add(panel);
        frame.setVisible(true);
    }

    private static void crearProducto() {
        // Lógica para crear el producto aquí...

        // Mostrar el mensaje de éxito
        JOptionPane.showMessageDialog(null, "El producto se ha creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
 
}
