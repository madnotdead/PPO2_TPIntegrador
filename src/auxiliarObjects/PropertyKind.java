/* Tipo de Inmueble */

package auxiliarObjects;

public class PropertyKind {
	private String name;

	public PropertyKind(final String aName) {
		this.name = aName;
	}
	
	public String getType() {
		return this.name;
	}
}
