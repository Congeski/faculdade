public class Principal {

	public static void main(String[] args) {
		
		int tempoSegundos = Tempo.leitura();
		
		int horas = Tempo.segundosParaHoras(tempoSegundos);
		tempoSegundos = tempoSegundos - (horas*3600);
		
		int minutos = Tempo.segundosParaMinutos(tempoSegundos);
		tempoSegundos = tempoSegundos - (minutos*60);
		
		int segundos = Tempo.segundosParaSegundos(tempoSegundos);
		
		Tempo.escreverTempo(Tempo.concatena(horas, minutos, segundos));
	}

}
