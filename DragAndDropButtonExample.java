import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragAndDropButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Drag and Drop Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JButton button = new JButton("Drag me!");
        button.setSize(100, 50);

        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JComponent component = (JComponent) e.getSource();
                TransferHandler handler = component.getTransferHandler();
                handler.exportAsDrag(component, e, TransferHandler.COPY);
            }
        });

        button.setTransferHandler(new TransferHandler("text"));

        frame.getContentPane().add(button, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
