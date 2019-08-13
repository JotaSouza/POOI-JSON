package Exemplos.vetorEmatriz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class VetorJson{
	public int[] vetor;
}

public class ArrayJson {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores: ");
		int t = entrada.nextInt();
		
		int[] vet = new int[t];
		
		for (int i = 0; i < t; i++) {
			System.out.print("Informe o valo da posição "+i+": ");
			vet[i] = entrada.nextInt();
		}
		
				
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(vet));
		writer.close();
		
		//instancia o vetor e preenche com os dados informados
		VetorJson vetor = new VetorJson();
		vetor.vetor = vet;
		
		//como o objeto da classe GSON já estã instanciado
		String aux = gson.toJson(vetor);
		
		System.out.println(aux);
		
		
		entrada.close();
	}
	
	
}
