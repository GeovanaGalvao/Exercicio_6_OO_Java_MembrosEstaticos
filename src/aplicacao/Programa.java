package aplicacao;

import java.util.Scanner;

import utilitarios.Calculadora;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio = sc.nextDouble();
		double circunferencia = Calculadora.circunferencia(raio);
		double volume = Calculadora.volume(raio);
		System.out.printf("Circunferencia: %.2f%nVolume: %.2f%nValor do PI: %.2f%n",
				circunferencia,volume,Calculadora.PI);
		sc.close();
	}
}
