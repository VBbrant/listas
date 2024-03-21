package lista1;


import java.util.Scanner;

public class Ex10_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex10 obj= new Ex10();
		float preco1;
		int opcao1;
		System.out.println("Digite o valor da compra:");
		preco1= input.nextFloat();
		System.out.println("Digite a opcao de pagamento(1-À vista em dinheiro,2-À vista no cartão de crédito,3-Em duas vezes,4 Em três vezes):");
		opcao1= input.nextInt();
		obj.core(preco1,opcao1);
	}

}
