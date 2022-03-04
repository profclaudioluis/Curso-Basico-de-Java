package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Cláudio Luis"; 
	 	int idade = 27;
		char sexo = 'm';
		double temperatura = 30;
		boolean arCondicionado = false;
		System.out.println("USO DE VARIÁVEIS NA LINGUAGEM JAVA");
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("__________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i+5));
		System.out.println("i = " + i + " - 5 | i = " + (i-5));
		System.out.println("i = " + i + " * 5 | i = " + (i*5));
		System.out.println("i = " + i + " / 5 | i = " + (i/5));
		System.out.println("i = " + i + " % 5 | i = " + (i%5));
		System.out.println("i += 5           | i = " + (i+=5));
		System.out.println("i -= 5           | i = " + (i-=5));
		System.out.println("i /= 5           | i = " + (i/=5));
		i++;
		System.out.println("i++              | i = " + (i));
		i--;
		System.out.println("i--              | i = " + (i));
		System.out.println("__________________________________");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Ex.1: Uso do IF");
		
		
		if (sexo == 'm') {
			System.out.println("Alistamento militar obrigatório");
		}
		
		System.out.println("");
		System.out.println("Ex.2: Uso do IF - ELSE");
		if (idade < 18) {
			System.out.println("Menor de Idade");
		} else {
			System.out.println("Maior de Idade");
		}
				
		System.out.println("");
		System.out.println("Ex.3: Uso do 'else - if'");
		if(idade < 16) {
			System.out.println("Proibido Votar!");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("Voto obrigatório");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto Facultativo");
		} 
		
		System.out.println("");
		System.out.println("Ex.4: Uso do 'switch case'");
		System.out.println("1 Cadastro de clientes");
		System.out.println("2 Cadastro de usuários");
		System.out.println("3 Relatórios");
		
		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usuários");
			break;
		case 3:
			System.out.println("Relatórios");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		
		
	}
}