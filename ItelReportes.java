/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calendario_pdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author RIVAS
 */
public class ItelReportes extends javax.swing.JFrame {

    /**
     * Creates new form ItelReportes
     */
    public ItelReportes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton1)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\RIVAS\\Documents\\java\\ cuidadesEG.pdf"));
            Image bata = Image.getInstance("src/imag/m1.jpg");
            bata.scaleToFit(620, 930);
            bata.setAlignment(Chunk.ALIGN_CENTER);
            Image mbonda = Image.getInstance("src\\mbonda.jpeg");
            mbonda.scaleToFit(620, 930);
            mbonda.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image mbini = Image.getInstance("src\\mbini.jpeg");
            mbini.scaleToFit(620, 930);
            mbini.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image cogo = Image.getInstance("src\\cogo.jpeg");
            cogo.scaleToFit(620, 930);
            cogo.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image acalayok = Image.getInstance("src/acalayong.jpeg");
            acalayok.scaleToFit(620, 930);
            acalayok.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image anisok = Image.getInstance("src/añisok.jpeg");
            anisok.scaleToFit(620, 930);
            anisok.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image mongomo = Image.getInstance("src/mongomo.jpeg");
            mongomo.scaleToFit(620, 930);
            mongomo.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image malabo = Image.getInstance("src/bata.jpeg");
            malabo.scaleToFit(620, 930);
            malabo.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image baney = Image.getInstance("src/bata.jpeg");
            baney.scaleToFit(620, 930);
            baney.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Image rebola = Image.getInstance("src/bata.jpeg");
            rebola.scaleToFit(620, 930);
            rebola.setAlignment(Chunk.ALIGN_JUSTIFIED);
            Paragraph parafo = new Paragraph();
            parafo.add("TODAS LAS CIUDADES DE GUINEA ECUATORIAL");
            parafo.setAlignment(Paragraph.ALIGN_CENTER);
            Paragraph espacio = new Paragraph();
            espacio.add("\n\n\n");
            doc.open();
            PdfPTable tabla = new PdfPTable(1);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/practica", "root", "");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("select * from ciudades");
            String palabra = "";
            while (rs.next()) {
               palabra = rs.getString("ciudades");
                Paragraph pa = new Paragraph();
                pa.add("\n");
                switch (palabra) {
                    case "Bata":
                        tabla.addCell(palabra.toUpperCase());
                        doc.add(tabla);
                        doc.add(pa);
                        doc.add(bata);
                        doc.add(espacio);
                        break;
                    case "Mbonda":
                        tabla.addCell(palabra.toUpperCase());
                        doc.add(tabla);
                        doc.add(tabla);
                        doc.add(mbonda);
                        doc.add(espacio);
                        break;
                    case "Mbini":
                        tabla.addCell(palabra.toUpperCase());
                        doc.add(tabla);
                        doc.add(tabla);
                        doc.add(mbini);
                        doc.add(espacio);
                        break;
                    case "Cogo":
                        tabla.addCell(palabra.toUpperCase());
                        doc.add(tabla);
                        doc.add(tabla);
                        doc.add(cogo);
                        doc.add(espacio);
                        break;
                    case "Acalayog":
                        tabla.addCell(palabra.toUpperCase());
                        doc.add(tabla);
                        doc.add(tabla);
                        doc.add(acalayok);
                        doc.add(espacio);
                        break;
                }

            }
            doc.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Hecho");
        } catch (DocumentException | IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser choos = new JFileChooser();
        //        choos.setCurrentDirectory();
        choos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter ext = new FileNameExtensionFilter("*.jpeg", "JPEG");
        choos.setFileFilter(ext);
        int ss = choos.showOpenDialog(this);
        File file = choos.getSelectedFile();
        file.getAbsolutePath();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItelReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItelReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItelReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItelReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItelReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
