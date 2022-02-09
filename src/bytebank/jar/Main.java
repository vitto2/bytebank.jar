package bytebank.jar;

public class Main {

	public static void main(String[] args) {
		
		Conta contaVitor = new Conta(); 
		contaVitor.titular = "Vitor Silva de Souza"; 
		contaVitor.agencia = 241230; 
		contaVitor.sale = 0; 
		contaVitor.numero = 001; 
		
		Conta contaIolanda = new Conta(); 
		contaIolanda.titular = "Iolanda Lopes Gomes Martins"; 
		contaIolanda.agencia = 422312; 
		contaIolanda.sale = 0; 
		contaIolanda.numero = 002; 
		
		
		contaVitor.deposito(2500.00);
		
		contaIolanda.deposito(3500.00);
		
		
		System.out.println(contaVitor.showSale());
		
		System.out.println(contaIolanda.showSale());
		
		
		contaIolanda.transfer(500, contaVitor);
		
		System.out.println(contaVitor.showSale());
		
		contaVitor.transfer(1000, contaIolanda);
		
		System.out.println(contaIolanda.showSale());
		System.out.println(contaVitor.showSale());
		
		contaVitor.transfer(2010, contaIolanda);
		System.out.println(contaVitor.showSale());
		
	}

}
