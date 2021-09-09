import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma valor para converter: ");
		int numero = sc.nextInt();
		if(numero > 999) {
			System.out.println("Valor fora do limite!");
		}
		else {
			System.out.println(converterRomanos.Converter(numero));
		}
		
		sc.close();
	}

}
