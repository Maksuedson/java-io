package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWrite {

	public static void main(String[] args) throws IOException {
		
        PrintWriter ps = new PrintWriter("TestandoPrintStream.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println("Usando Print Writer");

        ps.close();
	}

}
