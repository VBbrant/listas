package lista1;


import java.util.Scanner;

public class Ex1_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex1 obj= new Ex1();
		int a1,b1,c1;
		System.out.println("Digite o primeiro valor:");
		a1= input.nextInt();
		System.out.println("Digite o segundo valor:");
		b1= input.nextInt();
		System.out.println("Digite o terceiro valor:");
		c1= input.nextInt();
		obj.core(a1, b1, c1);
	}

}
