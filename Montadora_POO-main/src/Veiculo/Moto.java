package Veiculo;

public class Moto extends Veiculo{

	public Moto (String cor, String marca, String modelo, int combustivel, int kml, int vmax, int preco) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.kml = kml;
        this.preco = preco;
        this.vmax = vmax;
    }
	
	public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getKml() {
        return kml;
    }

    public void setKml(int kml) {
        this.kml = kml;
    }
    
    public int getVmax() {
        return vmax;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}