package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Transforma o arquivo em um array de bits
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		// Converte o array de bits em um array de char
//		Writer osw = new OutputStreamWriter(fos);
//		// Converte o array de chars em strings
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		
		ps.close();
	}

}
