/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class TableExample {

    public static void main(String[] args) {

        Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
                Font.BOLD);
        Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                Font.NORMAL, BaseColor.RED);
        Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                Font.BOLD);
        Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                Font.BOLD);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("c:/temp/FirstPdf.pdf"));

            document.open();
            com.itextpdf.text.Image jpg = com.itextpdf.text.Image.getInstance("modelo.jpg");
            document.add(jpg);
            Paragraph preface = new Paragraph();
            preface.add(new Paragraph("Ordem de serviço", catFont));
            preface.setAlignment(Element.ALIGN_RIGHT);
            document.add(preface);

            document.close();

            File pdf = new File("c:/temp/FirstPdf.pdf");
            try {
                Desktop.getDesktop().open(pdf);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
            }

        } catch (Exception e) {

        }
    }
}
