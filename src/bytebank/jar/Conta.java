package bytebank.jar;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	
	void deposito(double value) { 
		
		saldo+=value; 
	}
}
