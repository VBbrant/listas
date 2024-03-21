package lista1;

import java.util.Scanner;

public class Ex4_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex4 obj= new Ex4();
		int num1,num2;
		System.out.println("Digite o primeiro valor:");
		num1= input.nextInt();
		System.out.println("Digite o segundo valor:");
		num2= input.nextInt();
		
		obj.core(num1,num2);
	}

}

