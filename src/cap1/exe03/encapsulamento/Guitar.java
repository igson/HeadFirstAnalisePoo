package cap1.exe03.encapsulamento;

import java.io.Serializable;

public class Guitar implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serialNumber;

	private Double price;

	private GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}
	
}
