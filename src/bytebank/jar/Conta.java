package bytebank.jar;

public class Conta {

	double sale;
	int agencia;
	int numero;
	String titular;

	
	void deposito(double value) { 
		
		sale+=value; 
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
		
		System.out.println("Olá, " + titular + "! Sua transferencia feita com sucesso. Seu novo saldo é de " + showSale());
	}
}
