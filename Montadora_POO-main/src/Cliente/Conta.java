package Cliente;

public class Conta {
	
	private float saldo;
	
	public Conta(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float preco) {
		this.saldo = this.saldo - preco;
	}
	
	

}
