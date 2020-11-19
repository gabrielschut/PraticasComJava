package sobrecarga;

public class PraticaSobrecarga {

	public void adiciona(int a, int b) {
		System.out.println("O resultado da soma foi :"+ (a+b));
	}
	
	public void adiciona(int a, int b, int c) {
		System.out.println("O resultado da soma foi :"+ (a+b+c));
	}
	
	public void adiciona(double a, double b) {
		System.out.println("O resultado da soma foi :"+ (a+b));
	}
	
	public void adiciona(String a, String b) {
		System.out.println("O resultado da soma foi :"+ (a+" "+b));
	}
}
