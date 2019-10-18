package auxiliarObjects;

public class Price {
	String currency;
	Integer amount;
	/**
	 * @param currency
	 * @param amount
	 */
	public Price(String currency, Integer amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public Integer getAmount() {
		return amount;
	}
	

}
