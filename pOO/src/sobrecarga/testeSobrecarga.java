package sobrecarga;

public class testeSobrecarga {
	public static void main(String[] args) {
	
		sobrecarga ss = new sobrecarga();
		ss.calcula(10);
		ss.ImprimeCalculo();
		ss.calcula(50, 26);
		ss.ImprimeCalculo();
		ss.calcula(3, 3, 3);
		ss.ImprimeCalculo();
		ss.calcula(3, 7, 6, 4);
		ss.ImprimeCalculo();
}
}
