/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.okaynet.andare.testes;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Erick
 */
public class PDFMaker {
	public static void main(String[] args) throws Exception {
		// Cria um novo documento com tamanho e margens definidas pelo
		// usuário
		// new Document(tamanho da página, margem esquerda, margem direita,
		// margem topo, margem rodapé);
		Document doc = new Document(PageSize.A4, 20, 20, 20, 20);

		// Criando o arquivo de saída.
		OutputStream os = new FileOutputStream("out.pdf");

		// Associando o doc ao arquivo de saída.
		PdfWriter.getInstance(doc, os);

		// Abrindo o documento para a edição
		doc.open();

                //Não se esqueça de arrumar o caminho para a imagem de sua preferência
		Image logo = Image.getInstance("C:\\Users\\Erick\\Desktop\\logo.png");

                //Alinhamento p/ a esquerda <<<
		logo.setAlignment(Image.ALIGN_LEFT);

		doc.add(logo);
		
		// Definindo uma fonte, com tamanho 20 e negrito
		Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
		Font f2 = new Font(FontFamily.COURIER, 12, Font.NORMAL);

		// Adicionando um parágrafo ao PDF, com a fonte definida acima
		Paragraph p = new Paragraph("Utilizando a API iText", f);

		// Setando o alinhamento p/ o centro
		p.setAlignment(Paragraph.ALIGN_RIGHT);

		// Definindo
		p.setSpacingAfter(50);
		doc.add(p);

		// Criando uma tabela com 3 colunas
		PdfPTable table = new PdfPTable(3);
		// Título para a tabela
		Paragraph tableHeader = new Paragraph("Um título de uma tabela simples",f2);

		PdfPCell header = new PdfPCell(tableHeader);
		// Definindo que o header vai ocupar as 3 colunas
		header.setColspan(3);
		// Definindo alinhamento do header
		header.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		// Adicionando o header à tabela
		table.addCell(header);

		List<String> list = new ArrayList<String>();
                

		list.add("Testando linha 1, coluna 1");
		list.add("Testando linha 1, coluna 2");
		list.add("Testando linha 1, coluna 3");
		list.add("Testando linha 2, coluna 1");
		list.add("Testando linha 2, coluna 2");
		list.add("Testando linha 2, coluna 3");
		list.add("Testando linha 3, coluna 1");
		list.add("Testando linha 3, coluna 2");
		list.add("Testando linha 3, coluna 3");

		for (String s : list) {
			table.addCell(s);
		}

		doc.add(table);

		doc.close();
	}
}