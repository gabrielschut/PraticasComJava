package pOO_08_09;

public class Cliente {
     public String nome;
     public int numconta;
     public static double saldo = 0.0;
     public String email;
     
     
     public static void exibesaldo() {
    	 System.out.println("Seu saldo é : " + saldo);
     }
     public void adicionasaldo(double s)
     {
    	 saldo+=s;
     }
}
