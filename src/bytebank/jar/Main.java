package bytebank.jar;

public class Main {

	public static void main(String[] args) {
		
		Conta contaVitor = new Conta(); 
		
		contaVitor.titular = "Vitor Silva de Souza"; 
		contaVitor.agencia = 241230; 
		contaVitor.saldo = 789.00; 
		contaVitor.numero = 001; 
		
		System.out.println(contaVitor.agencia);
		System.out.println(contaVitor.saldo);
		
		contaVitor.deposito(1000);
		
		System.out.println("Seu saldo é de " + contaVitor.saldo);
	}

}
