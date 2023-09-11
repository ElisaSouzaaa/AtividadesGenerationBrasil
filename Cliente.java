package exercicioOrientacaoObjeto;

public class Cliente {
	
	private String nome;
	private int idade;
	private String sexo;
	private String pagamento;
	private float saldo;
	
	public void visualizar1() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.sexo);
		System.out.println(this.pagamento);
		System.out.println(this.saldo);
	}
	
	public void visualizar2() {
		System.out.println("\n");
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.sexo);
		System.out.println(this.pagamento);
		System.out.println(this.saldo);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
