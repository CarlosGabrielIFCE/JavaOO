package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "windows-1252");
		
		while(scanner.hasNextLine()) {			
			String linha = scanner.nextLine();
			
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			// Parsing
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s - %d - %d - %s - %f", valor1, valor2, valor3, valor4, valor5);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
		}

		
		scanner.close();
		
	}

}
