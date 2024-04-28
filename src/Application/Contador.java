package Application;

import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int primeiroParam = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int segundoParam = sc.nextInt();
		
		try {
			contar(primeiroParam, segundoParam);
		}
		catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

	private static void contar(int primeiroParam, int segundoParam) throws ParametrosInvalidosException {
		if(primeiroParam > segundoParam) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contador = segundoParam - primeiroParam;
		
		for(int i = 1; i <= contador; i++) {
			System.out.printf("Imprimindo o número %d%n", i);
		}
	}

}
