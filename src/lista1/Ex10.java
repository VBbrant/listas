package lista1;



public class Ex10 {
	public void core(float preco,int opcao) {
		float pagar = 0;
		if (opcao==1) {
			pagar=(float) (preco*0.9);
		}
		else if (opcao==2) {
			pagar=(float) (preco*0.85);
			
		}
		else if (opcao==3) {
			pagar=(float) (preco);
			
		}
		else if (opcao==4) {
			pagar=(float) (preco*1.1);
			
		}
		System.out.println("O valor da compra é "+pagar+" reais");


		
	}
	



}
