import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Mouse_listener extends JFrame implements MouseInputListener {
    private int x, y;
    private String mensaje;

    public Mouse_listener() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    public void paint(Graphics gr) {
        super.paint(gr);
        gr.drawString(mensaje, x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse click";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse pressed "+ x+", "+y;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse Released "+ x+", "+y;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse Entered "+ x+", "+y;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse exited "+ x+", "+y;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        mensaje = "This is  mouse Dragged "+ x+", "+y;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        x = e.getX();
        y = e.getY();
        mensaje = "This is mouse mouved "+ x+", "+y;
        repaint();
    }

    public static void main(String[] args) {
        Mouse_listener rivas = new Mouse_listener();
        rivas.setVisible(true);
        rivas.setLocationRelativeTo(null);
        rivas.setSize(400, 400);

    }

   

}
