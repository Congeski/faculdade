public class converterRomanos {

	public static String Converter(int num){
		int valorNumerico[] = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String valorRomano[] = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		String conversaoRomano = "";
		
		int i = 0;
		
		while(num > 0) {
			if(num >= valorNumerico[i]) {
				conversaoRomano = conversaoRomano + valorRomano[i];
				num -= valorNumerico[i];
			}
			else {
				i++;
			}
	 }
		return conversaoRomano;
	}
}
