import java.util.ArrayList;
import java.util.List;

public class Montadora {
	List<Veiculo> veiculos = new ArrayList<Veiculo>();
	String nome;

	public void insere_veiculo(Veiculo v1) {
		veiculos.add(v1);
	}
	
	public void mostra_veiculo() {
		if(veiculos.size() > 0) {
			for(int i = 0; i< veiculos.size(); i++) {
				System.out.print((i+1) + " ");
				veiculos.get(i).Infos();
			}
		}
		else {
			System.out.println("Nao existem carros ainda.");
		}
		
		System.out.println("==========================");
	}
	
	public float getVeiculoPreco(int i) {
		return this.veiculos.get(i).getPreco();
	}
}
