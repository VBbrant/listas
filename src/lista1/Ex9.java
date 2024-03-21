package lista1;



public class Ex9 {
	public void core(float peso ,float altura) {
		float imc;
		imc=peso/(altura*altura);
		if (imc<18.5) {
			System.out.println("Abaixo do peso");
			
		}
		else if (imc>=18.5 && imc<25) {
			System.out.println(" Peso normal");
			
		}
		else if (imc>=25 && imc<30) {
			System.out.println("Acima do peso");
	
		}
		else if (imc>30) {
			System.out.println("obeso");
		}
		}



}
