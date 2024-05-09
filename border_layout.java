/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layous;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

/**
 *
 * @author RIVAS
 */
public class border_layout extends Frame {

    private Button b1, b2, b3, b4;
    private ScrollPane scroll;
    private TextArea area;
    public border_layout() {
        BorderLayout bor = new BorderLayout(HEIGHT, WIDTH);
        setLayout(bor);
        Container con = new Container();
        con.setBackground(new Color(0, 0, 0));
        b1 = new Button("B1");
        b1.setBackground(Color.red);
        b1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b2 = new Button("B2");
        b3 = new Button("B3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = area.getText();
                area.setText(txt + "\n");
            }
        });
        b4 = new Button("B4");
        area = new TextArea();
        scroll = new ScrollPane();
        scroll.add(area);
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(scroll, BorderLayout.CENTER);
        
    }

    public static void main(String[] args) {
        border_layout rivas = new border_layout();
        rivas.setVisible(true);
        rivas.setLocationRelativeTo(null);
        rivas.setSize(300, 250);
    }
}
