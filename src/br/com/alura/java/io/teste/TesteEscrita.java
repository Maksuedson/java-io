package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de saida de arquivo
		
		FileOutputStream fos = new FileOutputStream("TestandoEscrita.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando gravação de arquivo");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Testando gravação de arquivo2");
		
		
		bw.close();
	}

}
