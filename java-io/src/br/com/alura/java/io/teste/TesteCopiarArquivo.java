package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		// Transforma o arquivo em um array de bits
		InputStream fis = new FileInputStream("lorem.txt");
		// Converte o array de bits em um array de char
		Reader isr = new InputStreamReader(fis);
		// Converte o array de chars em strings
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while (linha != null) {
			
			System.out.println(linha);

			linha = br.readLine();
			
		}
		
		
		br.close();
	}

}
