package byteBankTeste_Herdado;

// quando criar o abstrato vc nao pode instanciar mais essa classe, mas irar existir a classe e o tipo, ou seja, essa classe é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected double salario; --- O "protected" está entre o "public" e "private". O protected significa que está publico SÓ para os "filhos" (irão enxergar).
	private double salario;
	
	
	//metodo sem corpo, não há implementação
	public abstract double getBonificacao();
		
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


