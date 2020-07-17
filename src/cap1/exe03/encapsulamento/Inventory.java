package cap1.exe03.encapsulamento;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Inventory implements Serializable {

	private static final long serialVersionUID = -1298686187250503746L;

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {

			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}

		}
		return null;
	}

	public List<Guitar> search(GuitarSpec searchGuitarSpec) {
		
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		
		for (Guitar guitar : guitars) {
			
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			
			if (searchGuitarSpec.getBuilder() != guitarSpec.getBuilder()) {
				continue;
			}

			String model = searchGuitarSpec.getModel().toLowerCase();

			if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase()))) {
				continue;
			}

			if (searchGuitarSpec.getType() != guitarSpec.getType()) {
				continue;
			}

			if (searchGuitarSpec.getBackWood() != guitarSpec.getBackWood()) {
				continue;
			}

			if (searchGuitarSpec.getTopWood() != guitarSpec.getTopWood()) {
				continue;
			}

			matchingGuitars.add(guitar);
		
		}

		return  matchingGuitars;

	}

	public List<Guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}

}
