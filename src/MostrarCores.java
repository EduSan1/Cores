import java.util.Scanner;

public class MostrarCores {

	public static void main(String[] args) {

		int naoEncontrado = 1;
		String cores[] = new String[10];
		cores[0] = "Azul";
		cores[1] = "Amarelo";
		cores[2] = "Vermelho";
		cores[3] = "Lilás";
		cores[4] = "Roxo";
		cores[5] = "Laranja";
		cores[6] = "Preto";
		cores[7] = "Verde";
		cores[8] = "Cinza";
		cores[9] = "Branco";

		System.out.print("Digite a cor que vc deseja:");
		Scanner leitor = new Scanner(System.in);
		String corEscolhida = leitor.next();
		leitor.close();

		for (int contador = 0; contador < cores.length; contador++) {

			if (corEscolhida.equalsIgnoreCase(cores[contador])) {

				System.out.println("A cor " + cores[contador] + " foi achada em nosso sistema!");
				naoEncontrado = 0;
				contador = cores.length;

			} else if (corEscolhida.equalsIgnoreCase("jorginho")){
				
				System.out.println("Jorginho realmente é uma boa escolha... até para cores");
				naoEncontrado = 0;
				contador = cores.length;

			}

		}

		if (naoEncontrado == 1) {

			System.out.println("Não encontramos sua cor...");

		} 

	}

}
