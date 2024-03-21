package lista1;

import java.util.Scanner;

public class Ex5_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex5 obj= new Ex5();
		int num1;
		System.out.println("Digite um numero:");
		num1= input.nextInt();
	
		obj.core(num1);
	}

}
