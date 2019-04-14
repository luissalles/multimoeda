package br.com.tolteca.multimoeda;

public class Dollar {
	int amount;
	
	Dollar(int amount){
		this.amount=amount;
	}
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
