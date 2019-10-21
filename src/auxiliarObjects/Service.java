/* Servicio que puede tener una propiedad */

package auxiliarObjects;

public class Service {
	private String name;

	public Service(final String aName) {
		this.name = aName;
	}

	public String getService() {
		return this.name;
	}
}
