/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layous;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;

/**
 *
 * @author RIVAS
 */
public class Flow_Layout extends Frame{
    private Button b1, b2, b3;
    public Flow_Layout(){
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT, 19, 10);
        setLayout(flow);
        Container con = new Container();
        con.setBackground(new Color(0, 0, 0));
        b1 = new Button("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b2 = new Button("B2");
        b3 = new Button("B3");
        add(b1);
        add(b2);
        add(b3);
    }
    public static void main(String[] args) {
        Flow_Layout rivas = new Flow_Layout();
        rivas.setVisible(true);
        rivas.setLocationRelativeTo(null);
        rivas.setSize(300, 250);
    }
}
