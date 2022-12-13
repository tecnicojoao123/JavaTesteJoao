import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a altura a ser convertida: ");
		float metros = teclado.nextFloat();
		float centimetros = +metros;

		System.out.println(metros + " Metros foram convertidos em " + centimetros + " centimetros.");

	}

}
