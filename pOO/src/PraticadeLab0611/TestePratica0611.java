package PraticadeLab0611;

public class TestePratica0611 {

	public static void main(String[] args) {
		
		NoteBook n1 = new NoteBook("010002","Sansung", 2200.5,"500Gb", "8Gb");
		MousePad mousepad = new MousePad("0002543", "Razer", 119.99, "Preto e verde", "Grande");
		
		System.out.println(n1.toString());
		System.out.println(mousepad.toString());
		
		n1.valorTotal();
		mousepad.valorTotal();
		
		System.out.println(n1.toString());
		
		System.out.println(mousepad.toString());
	}

}
