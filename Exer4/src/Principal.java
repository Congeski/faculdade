
public class Principal {

	public static void main(String[] args) {
		
		Produto arroz = new Produto("arroz", 31.50f, 10);
		Produto feijao = new Produto("feijao", 15.00f, 30);
		
		Pedido p1 = new Pedido(arroz, 3);
		Pedido p2 = new Pedido(feijao, 5);
		
		System.out.println(p1.calcularValor());
		System.out.println(p1.item.nome);
		System.out.println(p2.calcularValor());
		System.out.println(p2.item.nome);
		
	}

}
