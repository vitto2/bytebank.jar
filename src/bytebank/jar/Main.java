package bytebank.jar;

public class Main {

	public static void main(String[] args) {

		Cliente vitor = new Cliente();
		vitor.cpf = "123-456-8";
		vitor.nome = "Vitor Silva de Souza";
		vitor.profissao = "Programador";

		Conta contaVitor = new Conta();
		contaVitor.setTitular(vitor);
		contaVitor.agencia = 241230;
		contaVitor.numero = 001;

		Cliente iolanda = new Cliente();
		iolanda.cpf = "789-101112-13";
		iolanda.nome = "Iolanda lopes Gomes Martins";
		iolanda.profissao = "Engenheira de Software";

		Conta contaIolanda = new Conta();
		contaIolanda.setTitular(iolanda);
		contaIolanda.agencia = 422312;
		contaIolanda.numero = 002;
		
		System.out.println(contaVitor.getTitular().nome);

		
		 

	}

}
