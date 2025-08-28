package br.com.isiflix.interfaces;

public class MainClass {

	public static void main(String[] args) {
		
		InterfaceX obj = new InterfaceX() {
			@Override
			public int metodo(int valor) {
				return valor * 2;
			}
		};
		
		InterfaceX obj2 = new InterfaceX() {
			@Override
			public int metodo(int valor) {
				return valor * valor;
			}
		};
		
		InterfaceX obj3 = (x) -> { return x * 5; };
		InterfaceX obj4 = (x) -> { return 10 * x; };
		
		System.out.println(obj.metodo(5));
		System.out.println(obj2.metodo(5));
		System.out.println(obj3.metodo(6));
		System.out.println(obj4.metodo(9));
	}
	
}
