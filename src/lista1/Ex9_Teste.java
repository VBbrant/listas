package lista1;


import java.util.Scanner;

public class Ex9_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex9 obj= new Ex9();
		float altura1,peso1;
		System.out.println("Digite seu peso");
		peso1= input.nextFloat();
		System.out.println("Digite sua altura:");
		altura1= input.nextFloat();
		
		obj.core(peso1,altura1);
	}

}
