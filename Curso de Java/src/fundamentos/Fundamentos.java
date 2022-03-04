package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Cl�udio Luis"; 
	 	int idade = 27;
		char sexo = 'm';
		double temperatura = 30;
		boolean arCondicionado = false;
		System.out.println("USO DE VARI�VEIS NA LINGUAGEM JAVA");
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("__________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritm�ticos e Atribui��es");
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
			System.out.println("Alistamento militar obrigat�rio");
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
			System.out.println("Voto obrigat�rio");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto Facultativo");
		} 
		
		System.out.println("");
		System.out.println("Ex.4: Uso do 'switch case'");
		System.out.println("1 Cadastro de clientes");
		System.out.println("2 Cadastro de usu�rios");
		System.out.println("3 Relat�rios");
		
		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usu�rios");
			break;
		case 3:
			System.out.println("Relat�rios");
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
		
		
	}
}