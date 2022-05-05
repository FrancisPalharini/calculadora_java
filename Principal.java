import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  {

		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double n1 = scanner.nextInt();
		System.out.print("Digite outro número: ");
		double n2 = scanner.nextInt();
		
		
		int op1;
		do {
		
		System.out.println("-----DIGITE A OPERAÇÃO DESEJADA-----\n 1 - Soma\n 2 - Subtracao\n 3 - Multiplicacao\n 4 - Divisao\n 5 - Raiz Quadrada\n 6 - Potencia\n");
		Scanner codigo = new Scanner(System.in);
		int op = codigo.nextInt();
		
		
		switch(op) {
		case 1:
			 // soma
			
			System.out.println("Soma = " + calculadora.soma (n1,n2));
			break;
		case 2:
			//Subtracao
			System.out.println("Subtração = " + calculadora.subtracao (n1,n2));
			break;
		case 3:
			//Multiplicacao
			
			System.out.println("Multiplicação = " + calculadora.produto (n1,n2));
			break;
		case 4:
			//Divisao
			try {
				System.out.println("Divisão = " + calculadora.divisao (n1,n2));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 5:
			//Raiz Quadrada
			System.out.println("Raiz Quadrada N1 = " + calculadora.raiz (n1));
			System.out.println("Raiz Quadrada N2= " + calculadora.raiz (n2));
			break;
		case 6:
			//Potencia
			System.out.println("Potencia = " + calculadora.potencia (n1,n2));
			break;	
					
		
		default:
			System.out.println("Código incorreto...."); 
		break;
		}
		
		System.out.println("Deseja continuar?\n 1 - SIM\n 0 - NÃO"); 
		Scanner codigo1 = new Scanner(System.in);
		op1 = codigo1.nextInt();
		if (op1==0) {
			System.out.println("FIM");
		}
		
		

		} while (op1 !=0 && op1<= 1);
		
		
		
	}
}