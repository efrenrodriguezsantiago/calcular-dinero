import java.util.Scanner;

public class suma_3_numeros {

	public static void main(String[] args) {
		// hacer un programa que calcule e imprima la suma de tres numeros
		
		Scanner entrada = new Scanner(System.in);
		
		float numero1,numero2,numero3,suma;
		
		System.out.println("digite el primer numero ");
		numero1 = entrada.nextFloat();
		
		System.out.println("digite el segundo numero ");
		numero2 = entrada.nextFloat();
		
		System.out.println("digite el tercer numero ");
		numero3 = entrada.nextFloat();
		
		suma = numero1 + numero2 + numero3;
		
		
		System.out.println("la suma detres numeros es: "+suma);
		
	}

}
