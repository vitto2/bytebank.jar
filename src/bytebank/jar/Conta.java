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
		System.out.println("Deposito no valor de R$" + value + " foi feito com sucesso." + "Seu saldo atual � de R$ "
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
			System.out.println("Voc� n�o tem saldo o suficiente. Atualmente o seu saldo � de " + getSaldo());
		}

	}

	void transfer(double value, Conta destino) {

		withDraw(value);
		destino.deposito(value);

		System.out.println("Ol�, " + titular.getNome() + "! Sua transferencia feita com sucesso. Seu novo saldo � de "
				+ getSaldo());
	}

	// O cliente possui saldo dispon�vel para empr�stimo de 40% do saldo atual dele.
	void verificaEmprestimoDisponivel() {

		double saldo = getSaldo();

		if (saldo > 3000 && saldo < 40000) {
			System.out.println("Voc� possui R$" + saldo * 0.4 + " dispon�vel para empr�stimo!");
		} else {
			System.out.println(
					"Voc� n�o possui saldo dispon�vel para empr�stimo. Continue usando sua conta e tente novamente. ");
		}

	}

	double contratoEmprestimo(double valor) {
	
			
		if (getSaldo() > 3000 && getSaldo() < 4000) {
				if(valor<=getSaldo() * 0.4) { 
						System.out.println("Empr�stimo contratado com sucesso! O valor j� est� na sua conta :)");			
							deposito(valor);
							} else { 
								System.out.println("Voc� n�o possui esse saldo dispon�vel para empr�stimo");
							}
								} 
									double saldoEmprestimo = (getSaldo()*0.4) - valor;
		
									return saldoEmprestimo; 
	}
}
