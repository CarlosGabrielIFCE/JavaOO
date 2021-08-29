package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println("Saldo da conta: " + conta.saldo);
		conta.saca(30);
		System.out.println(conta.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, conta);
		System.out.println("Saldo da Marccela: " + contaMarcela.saldo);
		System.out.println("Saldo da conta: " + conta.saldo);
		
		conta.titular = "Paulo Silveira";
		System.out.println(conta.titular);
		
	}
	
}
