/* Servicio que puede tener una propiedad */

package auxiliarObjects;

public class Currency {
	private String name;

	public Currency(final String aName) {
		this.name = aName;
	}

	public String getCurrency() {
		return this.name;
	}

}
