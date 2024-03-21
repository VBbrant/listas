package lista1;

import java.util.Scanner;

public class Ex6_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex6 obj= new Ex6();
		boolean valor1, valor2;
		System.out.println("Digite um valor booleano:");
		valor1= input.nextBoolean();
		System.out.println("Digite um valor booleano:");
		valor2= input.nextBoolean();
	
		obj.core(valor1,valor2);
	}

}
