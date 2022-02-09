package bytebank.jar;

public class Main {

	public static void main(String[] args) {
		
		Cliente vitor = new Cliente(); 
		vitor.cpf = "123-456-8";
		vitor.nome = "Vitor Silva de Souza"; 
		vitor.profissao = "Programador"; 
		
		Conta contaVitor = new Conta(); 
		contaVitor.titular = vitor; 
		contaVitor.agencia = 241230; 
		contaVitor.sale = 0; 
		contaVitor.numero = 001; 
		
		
		Cliente iolanda = new Cliente(); 
		iolanda.cpf = "789-101112-13"; 
		iolanda.nome = "Iolanda lopes Gomes Martins"; 
		iolanda.profissao = "Engenheira de Software";
		
		Conta contaIolanda = new Conta(); 
		contaIolanda.titular = iolanda; 
		contaIolanda.agencia = 422312; 
		contaIolanda.sale = 0; 
		contaIolanda.numero = 002; 
		
		contaVitor.deposito(2500.00);
		
		contaIolanda.deposito(3500.00);
	
	
		
		
		
	
		
	}

}
