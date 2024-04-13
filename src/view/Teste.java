package view;

import model.Conta;

public class Teste {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setAgencia(15);
		c.setCodigo(23);
		c.setSaldo(500);
		c.setLimite(200);
		
		c.deposita(100);
		System.out.printf("R$%.2f\n",c.getSaldo());
		
		try {
			c.saca(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("R$%.2f\n",c.getSaldo());
		
		try {
			c.saca(900);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("R$%.2f\n",c.getSaldo());
	}

}
