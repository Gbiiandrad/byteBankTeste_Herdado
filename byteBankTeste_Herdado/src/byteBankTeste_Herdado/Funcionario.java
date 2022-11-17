package byteBankTeste_Herdado;

public class Funcionario {
	
	private String nome;
	private String cpf;
	//protected double salario; --- O "protected" está entre o "public" e "private". O protected significa que está publico SÓ para os "filhos" (irão enxergar).
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}


