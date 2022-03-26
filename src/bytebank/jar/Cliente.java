package bytebank.jar;

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
	
	
	void setNome(String nome) { 
		this.nome = nome; 
	}
	
	String getNome() { 
		return this.nome; 
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
}
