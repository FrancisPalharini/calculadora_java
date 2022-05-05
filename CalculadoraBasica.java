
public class CalculadoraBasica extends Calculadora {


	public double soma(double a, double b) {
		double resultado_soma;
		resultado_soma = a+b;
		return resultado_soma;
	}

	
	public double subtracao(double a, double b) {
		double resultado_subtracao;
		resultado_subtracao = a-b;
		return resultado_subtracao;	
	
	}

	
	public double produto(double a, double b) {
		double resultado_multiplicacao;
		resultado_multiplicacao = a*b;
		return resultado_multiplicacao;
		
	}

	
	public double divisao(double a, double b) throws Exception {
		double resultado_divisao;
		
		if (b==0) {
			throw new Exception ("NÃO É POSSIVEL DIVIDIR POR 0");
		} else {
			resultado_divisao = a/b;
			return resultado_divisao;			
		
		}
		
		
	}

}
