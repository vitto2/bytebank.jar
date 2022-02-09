package bytebank.jar;

public class Conta {

	double sale;
	int agencia;
	int numero;
	Cliente titular;

	
	void deposito(double value) { 
		
		sale+=value; 
		System.out.println("Deposito no valor de R$" + value + " foi feito com sucesso." + "Seu saldo atual é de R$ " + showSale());
	}
	
	double showSale() { 
		
		
		
		return sale; 
	}
	
	void withDraw(double value) { 
		
		if(value<=sale) { 
			sale-=value; 
		} else { 
			System.out.println("Você não tem saldo o suficiente. Atualmente o seu saldo é de " + showSale());
		}
		
	}
	
	void transfer(double value, Conta destino) { 
	
		withDraw(value);
		destino.deposito(value);
		
		System.out.println("Olá, " + titular.nome + "! Sua transferencia feita com sucesso. Seu novo saldo é de " + showSale());
	}
}
