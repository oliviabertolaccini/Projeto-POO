package Cliente;

public class Cliente{
	
	private String nome;
	private long cpf;
	private Conta c;
	
	public Cliente(String nome, long cpf, int saldo) {
		this.nome = nome;
		this.cpf = cpf;
		c = new Conta(saldo);
	}
	
	public void comprarVeiculo(float preco) throws SaldoInsuficiente{
		if(this.c.getSaldo() >= preco) {
			System.out.println("Comprando veiculo...");
			this.c.setSaldo(preco);
		}
		else {
			throw new SaldoInsuficiente("Saldo Insuficiente.");
		}
	}
	
}
