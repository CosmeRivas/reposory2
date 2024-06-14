/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RIVAS
 */
class MyAdapter extends Dialog {

    public MyAdapter(Menu1 f) {
        super(f, "Warning!!", true);
        this.setSize(210, 130);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        Label label = new Label("Do you wanna close this?");
        label.setFont(new Font("Tahoma", 3, 15));
        label.setForeground(new Color(120, 56, 100));
        add(label);
        Button bot1 = new Button("OK");
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ev) {
                System.exit(0);
            }
        });
        bot1.setBackground(Color.red);
        add(bot1);
        Button bot2 = new Button("concel");
        bot2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent ev){
                try {
                    this.wait(87899);
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyAdapter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        bot2.setBackground(Color.green);
        add(bot2);
    }
}

public class Menu1 extends Frame implements ActionListener {

    private MenuBar barra;
    private Menu menu;
    private MenuItem ite1;
    private MenuItem item2;
    private MenuItem sep;

    public Menu1() {
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        barra = new MenuBar();
        setMenuBar(barra);
        menu = new Menu("menu");
        barra.add(menu);
        ite1 = new MenuItem("1");
        ite1.addActionListener(this);
        menu.add(ite1);
        sep = new MenuItem("-");
        menu.add(sep);
        item2 = new MenuItem("2");
        menu.add(item2);
        item2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        switch (label) {
            case "1":
                this.dispose();
                break;
            case "2":
                MyAdapter ad = new MyAdapter(this);
                ad.setVisible(true);
                
                break;
        }
    }

    public static void main(String args[]) {
        Menu1 rivas = new Menu1();
        rivas.setVisible(true);
        rivas.setLocationRelativeTo(null);
        rivas.setSize(200, 200);

    }
}
