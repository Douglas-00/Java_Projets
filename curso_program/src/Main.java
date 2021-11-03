import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		double x = 10.544556;
		
		String nome = "Douglas";
		int idade = 31;
		Double renda = 4000.0;
		
		System.out.println(x);
		//Resultado com 2 casas Decimais
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		//set Locale defini para retirar a virgula do valor double
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		//Concatenando com a variavel
		System.out.println("Resultado = " + x + " Metros");
		
		//Concatenando varios elementos no mesmo comando de escrita
		
		System.out.printf("Valor = %.2f%n", x);
		
		//Valores interpolados no printf
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ",nome,idade,renda);
		
		
		

	}

}
