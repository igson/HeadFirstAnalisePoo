package cap1.exe02;

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

	public Guitar search(Guitar searchGuitar) {
		
		// List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		
		for (Guitar guitar : guitars) {

			if (searchGuitar.getBuilder() != guitar.getBuilder()) {
				continue;
			}

			String model = searchGuitar.getModel().toLowerCase();

			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) {
				continue;
			}

			if (searchGuitar.getType() != guitar.getType()) {
				continue;
			}

			if (searchGuitar.getBackWood() != guitar.getBackWood()) {
				continue;
			}

			if (searchGuitar.getTopWood() != guitar.getTopWood()) {
				continue;
			}

			//matchingGuitars.add(guitar);
			 
			return guitar;
		}

		//return  matchingGuitars;
		return null;

	}

	public List<Guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}

}
