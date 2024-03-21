package lista1;



public class Ex11 {
	public void core(float nota1 ,float nota2 , float nota3,float media, int matricula) {
	float ma;
	String mencao = null;
	String result;
	ma=((nota1+(nota2*2)+(nota3*3))+media)/7;
	if(ma>=90) {
		mencao="A";
	}
	else if (ma>=75 && ma<90) {
		mencao="B";
		
	}
	else if (ma>=60 && ma<75) {
		mencao="C";
		
	}
	else if (ma>=40 && ma<60) {
		mencao="D";
		
	}
	else if (ma<40) {
		mencao="E";
		
	}
	
	
	if (mencao=="A"||mencao=="B"||mencao=="C") {
		result="Aprovado";
	}
	else {
		result="Reprovado";
	}
	System.out.println(matricula);
	System.out.println(nota1);
	System.out.println(nota2);
	System.out.println(nota3);
	System.out.println(media);
	System.out.println(mencao);
	System.out.println(result);
	System.out.println(ma);
	}
	



}
