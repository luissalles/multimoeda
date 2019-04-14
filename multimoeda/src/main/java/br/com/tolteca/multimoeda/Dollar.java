package br.com.tolteca.multimoeda;

public class Dollar {
	int amount;
	
	Dollar(int amount){
		this.amount=amount;
	}
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	public boolean equal(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}
