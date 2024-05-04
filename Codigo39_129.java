/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_de_barras;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RIVAS
 */
public class Codigo39_129 {

    public static void main(String arg[]) {
        try {
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("barras.pdf"));
            doc.open();

            Barcode39 barra = new Barcode39();
            barra.setCode("123456778");
            Image img = barra.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.GRAY);
            doc.add(img);
            
            doc.add(new Paragraph("\n"));
            
            Barcode128 barra18 = new Barcode128();
            barra18.setCode("894452345");
            Image imag18 = barra18.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLUE, BaseColor.GREEN);
            imag18.scalePercent(250);
            imag18.setAlignment(Chunk.ALIGN_CENTER);
            doc.add(imag18);
            
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Codigo39_129.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Codigo39_129.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
