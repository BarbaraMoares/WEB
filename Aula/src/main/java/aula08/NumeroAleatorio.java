package aula08;

public class NumeroAleatorio {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Double valor = Math.random() * 10;
			System.out.println(valor.intValue() + " "); 
			//Math.random() retorna um double maior ou igual a 0.0 e menor que 1.0
		}
	}
}
