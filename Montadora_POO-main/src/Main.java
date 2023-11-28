import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Scanner valorTeclado = new Scanner(System.in);
		
		System.out.println("Adicionar um veiculo? (1-Sim 2-Nao)");
		int opcao = valorTeclado.nextInt();
		
		Montadora m1 = new Montadora();
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		while(opcao == 1) {
			valorTeclado.nextLine();
			System.out.println("Escolha a cor do veiculo:");
			String cor = valorTeclado.nextLine();
			System.out.println("Escolha a marca do veiculo:");
			String marca = valorTeclado.nextLine();
			System.out.println("Escolha o modelo do veiculo:");
			String modelo = valorTeclado.nextLine();
			System.out.println("Quantos litros de combustivel tem no veiculo?");
			int combustivel = valorTeclado.nextInt();
			System.out.println("Quantos km por litro ele faz?");
			int kml = valorTeclado.nextInt();
			System.out.println("Qual a velocidade maxima do veiculo?");
			int vmax = valorTeclado.nextInt();
			System.out.println("Defina o valor do veiculo:");
			int preco = valorTeclado.nextInt();
			
			
			System.out.println("Gostaria de adicionar um carro ou uma moto? (1-Carro 2-Moto)");
			opcao = valorTeclado.nextInt();
			
			if(opcao == 1) {
				Veiculo carro = new Carro(cor, marca, modelo, combustivel, kml, vmax, preco);
				veiculos.add(carro);
			}
			if(opcao == 2) {
				Veiculo moto = new Moto(cor, marca, modelo, combustivel, kml, vmax, preco);
				veiculos.add(moto);
			}
			
			System.out.println("Adicionar outro veiculo? (1-Sim 2-Nao)");
			opcao = valorTeclado.nextInt();
		}
		
		for(int i = 0; i<veiculos.size(); i++) {
			System.out.print("Veiculo " + (i+1) + " eh do modelo: ");
			
			if(veiculos.get(i) instanceof Carro) {
				Carro c = (Carro) veiculos.get(i);
				System.out.println(c.getModelo());
				System.out.println("Gostaria de inserir esse carro na montadora? (1-sim 2-nao)");
				opcao = valorTeclado.nextInt();
				
				if(opcao == 1) {
					m1.insere_veiculo(c);
				}
			}
			
			if(veiculos.get(i) instanceof Moto) {
				Moto m = (Moto) veiculos.get(i);
				System.out.println(m.getModelo());
				System.out.println("Gostaria de inserir essa moto na montadora? (1-sim 2-nao)");
				opcao = valorTeclado.nextInt();
				
				if(opcao == 1) {
					m1.insere_veiculo(m);
				}
			}
		}
		
		Cliente cliente1 = new Cliente("Pepe", 12345678, 100000);
		
		System.out.println("O cliente deseja comprar algum veiculo? 1-sim 2-nao");
		opcao = valorTeclado.nextInt();
		
		while(opcao == 1){
			System.out.println("Qual veiculo o cliente deseja compar? (Digite o numero do veiculo)");
			m1.mostra_veiculo();
			opcao = valorTeclado.nextInt();
			
			try {
				cliente1.comprarVeiculo(m1.getVeiculoPreco(opcao-1));
				System.out.println("Compra efetuada com sucesso!");
			}catch(Exception e) {
				System.out.println("Erro: " + e);
				System.out.println("Nao foi possivel finalizar sua compra. Tente novamente quando tiver dinheiro...");
			}
			System.out.println("O cliente deseja comprar mais algum veiculo? 1-sim 2-nao");
			opcao = valorTeclado.nextInt();
		}
		
		
		
		valorTeclado.close();
	}

}
