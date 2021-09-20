package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
        PrintStream ps = new PrintStream("TestandoPrintStream.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdﬂ");

        ps.close();
	}

}
