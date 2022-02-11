package bytebank.jar;

public class Conta {

	private double sale;
	int agencia;
	int numero;
	Cliente titular;

	void deposito(double value) {

		sale += value;
		System.out.println("Deposito no valor de R$" + value + " foi feito com sucesso." + "Seu saldo atual � de R$ "
				+ getSaldo());
	}

	double getSaldo() {

		return sale;
	}

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

		System.out.println(
				"Ol�, " + titular.nome + "! Sua transferencia feita com sucesso. Seu novo saldo � de " + getSaldo());
	}
}
