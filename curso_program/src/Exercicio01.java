import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Serviço";
		
		byte idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double total = 53.234567;
		
		System.out.println("Produtos: ");
		
		System.out.printf("%s, com preço de $  %.2f%n ",produto1,preco1);
		System.out.printf("%s é %.2f%n ",produto2, preco2);
		System.out.println();
		System.out.printf("Record: %d anos, codigo %d e sexo: %c%n ",idade,codigo,sexo);
		System.out.println();
		System.out.printf("Numero em Decimal: %f%n",total);
		System.out.printf("Numero com 3 casas Decimais: %.3f%n",total );
		Locale.setDefault(Locale.US);
		System.out.printf("Numero com formato dos estados unidos %.3f%n",total);
	}

}
