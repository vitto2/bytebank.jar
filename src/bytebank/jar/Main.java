package bytebank.jar;

public class Main {

	public static void main(String[] args) {
		
		Conta contaVitor = new Conta(); 
		
		contaVitor.titular = "Vitor Silva de Souza"; 
		contaVitor.agencia = 241230; 
		contaVitor.saldo = 789.00; 
		contaVitor.numero = 001; 
		
		System.out.println(contaVitor.agencia);
	}

}
