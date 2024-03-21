package lista1;

import java.util.Scanner;

public class Ex2_Teste {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		Ex2 obj= new Ex2();
		int tempo = 0 ;
		String sexo,estado;
		
		System.out.println("Digite se sexo:");
		sexo=input.next();
		System.out.println("Digite o primeiro valor:");
		estado=input.next();
		if (sexo.equals("F") && estado.equals("CASADA")) {
			System.out.println("Digite o tempo de casada :");
			tempo=input.nextInt();
		}
		obj.core(sexo, estado, tempo);
	}




}

