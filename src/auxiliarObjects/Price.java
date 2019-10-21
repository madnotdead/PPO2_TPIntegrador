package auxiliarObjects;

public class Price {
	Currency currency;
	Double amount;
	/**
	 * @param currency
	 * @param amount
	 */
	public Price(Currency aCurrency, Double amount) {
		super();
		this.currency = aCurrency;
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public Double getAmount() {
		return amount;
	}
}
