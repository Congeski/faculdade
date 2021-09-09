import java.util.Scanner;

public class Tempo {

	public static int leitura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um periodo de tempo em segundos");
		int tempo = sc.nextInt();
		sc.close();
		return tempo;
	}

	public static int segundosParaMinutos(int tempo) {
		return (tempo / 60);
	}

	public static int segundosParaHoras(int tempo) {
		return (tempo / 3600);
	}

	public static int segundosParaSegundos(int tempo) {
		return tempo;
	}

	public static void escreverTempo(String tempo) {
		System.out.println(tempo);
	}

	public static String concatena(int horas, int minutos, int segundos) {
		return Integer.toString(horas) + " horas " + Integer.toString(minutos) + " minutos "
				+ Integer.toString(segundos) + " segundos ";
	}
}
