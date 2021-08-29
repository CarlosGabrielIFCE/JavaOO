
public class TesteSubstring {
	
	public static void main(String[] args) {
		
		// 5410000044-0
		String agenciaConta = "5410000044-0";
		String agencia = agenciaConta.substring(0, 3);
		Long conta = Long.parseLong(agenciaConta.substring(3, 10));
		System.out.println(agencia);
		System.out.println(conta);
		
	}

}
