package utilitarios;

public class Calculadora {
	
	public static final double PI = Math.PI;
	
	public static double circunferencia(double raio) { return 2.00*PI*raio; }
	public static double volume(double raio) { return 4.00*PI*Math.pow(raio, 3)/3.00; }
}
