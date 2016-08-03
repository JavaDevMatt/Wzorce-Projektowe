package pl.javadevmatt.builder.classic.entities;

public class Tires {

	private String type;
	
	private int durability;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	@Override
	public String toString() {
		return "Tires [type=" + type + ", durability=" + durability + "]";
	}
	
	
}
