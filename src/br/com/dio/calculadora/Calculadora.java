package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int a = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = entrada.nextInt();
		
		int adicao = adicao(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("Adição: " + adicao);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);

	}
	
	private static int adicao(int a, int b) {
		return a + b;
	}
	
	private static int subtracao(int a, int b) {
		return a - b;
	}
	
	private static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	private static double divisao(double a, double b) {
		return a / b;
	}

}
