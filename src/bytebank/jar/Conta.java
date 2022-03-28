package bytebank.jar;

public class Conta {

	private double sale;
	int agencia;
	int numero;
	private Cliente titular;

	
	
	public int getAgencia() { 
		
		return this.agencia; 
	}
	
	public int getNumero() { 
		
		return this.numero; 
	}
	public Conta(int agencia, int numero) { 
		this.agencia = agencia; 
		this.numero = numero; 
		
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	void deposito(double value) {

		sale += value;
		System.out.println("Deposito no valor de R$" + value + " foi feito com sucesso." + "Seu saldo atual é de R$ "
				+ getSaldo());
	}

	double getSaldo() {

		return sale;
	}

	// Sacar
	void withDraw(double value) {

		if (value <= sale) {
			sale -= value;
		} else {
			System.out.println("Você não tem saldo o suficiente. Atualmente o seu saldo é de " + getSaldo());
		}

	}

	void transfer(double value, Conta destino) {

		withDraw(value);
		destino.deposito(value);

		System.out.println("Olá, " + titular.getNome() + "! Sua transferencia feita com sucesso. Seu novo saldo é de "
				+ getSaldo());
	}

	// O cliente possui saldo disponível para empréstimo de 40% do saldo atual dele.
	void verificaEmprestimoDisponivel() {

		double saldo = getSaldo();

		if (saldo > 3000 && saldo < 40000) {
			System.out.println("Você possui R$" + saldo * 0.4 + " disponível para empréstimo!");
		} else {
			System.out.println(
					"Você não possui saldo disponível para empréstimo. Continue usando sua conta e tente novamente. ");
		}

	}

	double contratoEmprestimo(double valor) {
	
			
		if (getSaldo() > 3000 && getSaldo() < 4000) {
				if(valor<=getSaldo() * 0.4) { 
						System.out.println("Empréstimo contratado com sucesso! O valor já está na sua conta :)");			
							deposito(valor);
							} else { 
								System.out.println("Você não possui esse saldo disponível para empréstimo");
							}
								} 
									double saldoEmprestimo = (getSaldo()*0.4) - valor;
		
									return saldoEmprestimo; 
	}
}
