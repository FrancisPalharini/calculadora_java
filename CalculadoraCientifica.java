
public class CalculadoraCientifica extends CalculadoraBasica {

	public double raiz (double a) {
		double resultado_raiz;
		resultado_raiz = Math.sqrt(a);
		return resultado_raiz;	
	}
	
	public double potencia (double a, double b) {
		double resultado_potencia;
		resultado_potencia = Math.pow(a,b);
		return resultado_potencia;	
	}
	
	
}