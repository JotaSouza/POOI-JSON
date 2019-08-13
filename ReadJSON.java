package ExJSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {

	public static void main(String[] args) throws IOException {
		
		String string;
		FileReader arquivo = new FileReader("arrayjson.json");
		BufferedReader read = new BufferedReader(arquivo);
		string = read.readLine();
		string = string.replace("[","");
		string = string.replace("]","");
		String[] vet = string.split(",");
		int[] vetor = new int[vet.length];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(vet[i]);
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		read.close();
	}

}
