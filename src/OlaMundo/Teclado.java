package OlaMundo;
import java.util.Scanner;

public class Teclado {
	public static void main(String[] arga) {
	  Scanner scanner= new Scanner (System.in);
	  System.out.print("Digite Seu Nome: ");
	  String nome = scanner.nextLine();
	  System.out.print("Digite Sua Idade: ");
	  int idade = scanner.nextInt();
	  System.out.println("Nome: " + nome);
	  System.out.println("Idade " + idade);
	  scanner.close();
	}
	

}
