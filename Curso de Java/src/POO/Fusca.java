package POO;

public class Fusca {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1990;
		fusca.cor = "Preto";
		System.out.println("Carro: Fusca");
		System.out.println("Cor: " + fusca.cor);
		System.out.println("Ano: " + fusca.ano);
		fusca.ligar();
		fusca.acelelar();
		fusca.desligar();
	}

}
