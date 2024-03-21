package lista1;


import java.util.Scanner;

public class Ex11_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex11 obj= new Ex11();
		int matricula1;
		float prova1a,prova2a,prova3a,media1;
		System.out.println("Digite a matricula:");
		matricula1= input.nextInt();
		System.out.println("Digite o valor da primeira prova:");
		prova1a= input.nextFloat();
		System.out.println("Digite o  valor da segunda prova:");
		prova2a= input.nextFloat();
		System.out.println("Digite o  valor da terceira prova:");
		prova3a= input.nextFloat();
		System.out.println("Digite o  valor da media dos trabalhos:");
		media1= input.nextFloat();
		obj.core(prova1a,prova2a,prova3a,media1,matricula1);
	}

}
