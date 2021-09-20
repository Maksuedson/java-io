package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteGravaTeclado {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada de Arquivo
		
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);		
		BufferedReader br = new BufferedReader(isr);
		
		//Fluxo de saida de arquivo
		OutputStream fos = new FileOutputStream("TestandoEscrita.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
