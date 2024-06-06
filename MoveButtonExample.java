import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
     
    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Move Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boolean veri = true;
        JButton button = new JButton("Move me!");
        button.setSize(100, 50);
        button.setLocation(100, 100); // Set initial position

        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button.getComponentAt(e.getPoint()).getLocation();
            }
        });

        button.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = button.getLocation();
                int x = p.x + e.getX() - button.getWidth() / 2;
                int y = p.y + e.getY() - button.getHeight() / 2;
                button.setLocation(x, y);
            }
        });
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(veri){
                    button.setBackground(Color.orange);
                    veri = false;
                }else{
                    button.setBackground(Color.white);
                    veri = true;
                }
                
            }
        });
        frame.getContentPane().setLayout(null); // Use null layout for precise positioning
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
