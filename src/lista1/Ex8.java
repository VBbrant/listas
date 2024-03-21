package lista1;



public class Ex8 {
	public void core(int a ,int b, int c) {
		
		if (a>b && b>c && a>c) {
			System.out.println(a+" "+b+" "+c);
		} 
		else if (a>b && b<c && a>c)	{
			System.out.println(a+" "+c+" "+b);
			}
		else if (b>a && c<a && b>c) {
			System.out.println(b+" "+a+" "+c);
				
			}
		else if (b>a && c>a && b>c) {
			System.out.println(b+" "+c+" "+a);
				
			} 
		else if (c>b && b>a && c>a) {
			System.out.println(c+" "+b+" "+a);
				
			}
		else if (c>b && b<a && c>a) {
			System.out.println(c+" "+a+" "+b);
				
			}
		
		}
	



}
