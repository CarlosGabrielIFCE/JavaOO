
public class TestaConversao {

	public static void main(String[] args) {

		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 123123123l;
		short valorPequeno = 1231;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double valor3 = valor1 + valor2;
		System.out.println(valor3);

	}

}
