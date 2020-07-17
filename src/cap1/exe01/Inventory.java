package cap1.exe01;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Inventory implements Serializable {

	private static final long serialVersionUID = -1298686187250503746L;
	
	private List<Guitar> guitars;
	
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	
	public void addGuitar(String serialNumber, Double price, String builder, String model, String type, String backWood, String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);	
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			
			if ( guitar.getSerialNumber().equals(serialNumber) ) {
				return guitar;
			}
			
		}
		return null;
	}
	
	public Guitar search(Guitar searchGuitar) {
		
		for (Guitar guitar : guitars) {
			
			String builder = searchGuitar.getBuilder();
			
			if ( (builder != null) && ( !builder.equals("") ) && ( !builder.equals( guitar.getBuilder() ) ) ) {
				continue;
			}
			
			String model = searchGuitar.getModel();
			
			if ( (model != null) && ( !model.equals("") ) && ( !model.equals( guitar.getModel() ) ) ) {
				continue;
			}
			
			String type = searchGuitar.getType();
			
			if ( (type != null) && ( !type.equals("") ) && ( !type.equals( guitar.getType() ) ) ) {
				continue;
			}
			
			String backWood = searchGuitar.getBackWood();
			
			if ( (backWood != null) && ( !backWood.equals("") ) && ( !backWood.equals( guitar.getBackWood() ) ) ) {
				continue;
			}
			
			String topWood = searchGuitar.getTopWood();
			
			if ( (topWood != null) && ( !topWood.equals("") ) && ( !topWood.equals( guitar.getTopWood() ) ) ) {
				continue;
			}
			
		}
		
		return null;
		
	} 
	
	
	public List<Guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
	
}
