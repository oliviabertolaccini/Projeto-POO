
public abstract class Veiculo {

    String cor;
    String marca;
    String modelo;
    int combustivel;
    int kml;
    int vmax;
    float preco;


    public void Infos() {
    	System.out.println(this.marca + " " + this.modelo + " " + this.cor + " " + this.combustivel + " " + this.kml + " " + this.vmax + " " + this.preco);
    }
    
    public float getPreco() {
    	return this.preco;
    }
}
