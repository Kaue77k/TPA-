import java.util. Scanner;
public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n, resultado, i=1;
		
		System.out.println("Digite um n�mero");
		n = ler.nextInt();
		System.out.println("A tabuada de "+n+" ser�");
		while (i<=10) {
		resultado = n*i;
		System.out.println(n+"x"+i+"="+resultado);
		i++;
		}
		ler.close();
		


	}

}
