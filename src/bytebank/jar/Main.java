package bytebank.jar;

public class Main {

	public static void main(String[] args) {

		Cliente vitor = new Cliente();
				vitor.setNome("Vitor Silva de Souza");
		Conta contaVitor = new Conta(13, 52328);	
		contaVitor.setTitular(vitor); //
					

		
		System.out.println(contaVitor.getAgencia());
						
						
		
	}

}
