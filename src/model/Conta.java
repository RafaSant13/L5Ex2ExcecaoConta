package model;

public class Conta {
	
	private int agencia;
	private int codigo;
	private float saldo;
	private float limite;

	public Conta() {
		super();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void deposita(float valor) {
		setSaldo(valor+getSaldo());
	}
	
	public void saca(float valor) throws ArithmeticException {
		float limiteTotal = getSaldo()+getLimite();
		if (valor>limiteTotal) {
			throw new ArithmeticException("Não se pode sacar um valor maior que R$"+ limiteTotal);
		}
		else {
			if (valor <= getSaldo()) {
				setSaldo(getSaldo() - valor);
			} else {
				setLimite(getLimite() - (valor - getSaldo()));
				setSaldo(0);
			}
		}
	}
}
