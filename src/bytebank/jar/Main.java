package bytebank.jar;

public class Main {

	public static void main(String[] args) {

		Cliente vitor = new Cliente();
				vitor.setNome("Vitor Silva de Souza");
		Conta contaVitor = new Conta();	
		contaVitor.setTitular(vitor); //
					

						
						
		 
		System.out.println(contaVitor.getTitular().getNome()); 
		
		contaVitor.deposito(1800.00);
		
		System.out.println("Seu saldo é " + contaVitor.getSaldo());;
		
		contaVitor.verificaEmprestimoDisponivel();
		
		contaVitor.deposito(2000);
			
	
		contaVitor.verificaEmprestimoDisponivel();

		contaVitor.contratoEmprestimo(400);
		
	}

}
