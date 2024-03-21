package lista1;

import java.util.Scanner;

public class Ex3_Teste { 
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex3 obj= new Ex3();
		int num1;
		System.out.println("Digite o numero:");
		num1=input.nextInt();
		obj.core(num1);
	}

}
