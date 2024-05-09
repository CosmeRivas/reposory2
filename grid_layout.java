/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

/**
 *
 * @author RIVAS
 */
public class grid_layout extends Frame{
    private Button b1;
    int k= 0;
    public grid_layout(){
        GridLayout grid = new GridLayout(4, 4, 6,5);
        setLayout(grid);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                b1 = new Button("" +k);
                b1.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
                add(b1);
                k++;            
            }
        }
    }
     public static void main(String[] args) {
        grid_layout rivas = new grid_layout();
        rivas.setVisible(true);
        rivas.setLocationRelativeTo(null);
        rivas.setSize(300, 250);
    }
}
