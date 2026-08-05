import java.util.Scanner;

public class Treino {

    public static void main(String[] args) {
		System.out.println("oi");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu nome completo:");
		String nome = scan.nextLine();
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Nome: " +nome+ "\nIdade: " + idade);
	}

}
