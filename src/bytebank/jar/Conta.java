package bytebank.jar;

public class Conta {

	private double sale;
	int agencia;
	int numero;
	private Cliente titular;

	
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

	//Sacar
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

		System.out.println(
				"Olá, " + titular.getNome() + "! Sua transferencia feita com sucesso. Seu novo saldo é de " + getSaldo());
	}

	//O cliente possui saldo disponível para empréstimo de 40% do saldo atual dele. 
	void verificaEmprestimoDisponivel() { 
		
		double saldo = getSaldo(); 
		
		if(saldo>3000 && saldo <40000) { 
			System.out.println("Você possui "  + saldo * 0.4 + "disponível para empréstimo!");
		} else { 
			System.out.println("Você não possui saldo disponível para empréstimo. Continue usando sua conta e tente novamente. ");
		}
		
		
	}
}
