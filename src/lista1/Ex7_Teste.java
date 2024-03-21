package lista1;

import java.util.Scanner;

public class Ex7_Teste { 
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex7 obj= new Ex7();
		int num1;
		System.out.println("Digite o numero:");
		num1=input.nextInt();
		obj.core(num1);
	}

}
