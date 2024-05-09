import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class border_layout1 extends JFrame{
    JLabel label1;
    JButton botn;
    JPanel panel;
    public border_layout1(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //GroupLayout lay = new GroupLayout(getContentPane());
        //BorderLayout bor = new BorderLayout();
        //setLayout(bor);
        getContentPane().setBackground(Color.gray);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label1 = new JLabel("ESte es label 1");
        label1.setBounds(40, 78, 189, 23);
        add(panel);
        botn = new JButton("Boton1");
        botn.setBounds(40, 100, 89, 23);
        botn.setLayout(new BorderLayout());
        panel.add(botn, BorderLayout.WEST);

    }
    public static void main(String[] args) {
        border_layout1 rivas = new border_layout1();
        rivas.setLocationRelativeTo(null);
        rivas.setVisible(true);
        rivas.setSize(400, 400);
    }
}