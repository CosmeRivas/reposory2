import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class pop_Menu {
     public static void main(String[] args) {
        // Crear un JTextField
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField(20);
        panel.add(textField, BorderLayout.WEST);
        // Crear un JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();

        // Crear elementos de menú para el JPopupMenu
        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem pasteItem = new JMenuItem("Pegar");

        // Agregar ActionListener a los elementos de menú
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para copiar el texto del JTextField
                textField.copy();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para pegar texto en el JTextField
                textField.paste();
            }
        });

        // Agregar elementos de menú al JPopupMenu
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Asociar el JPopupMenu con el JTextField
        textField.setComponentPopupMenu(popupMenu);

        // Crear un JFrame para mostrar el JTextField
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
    
    }
    
}
