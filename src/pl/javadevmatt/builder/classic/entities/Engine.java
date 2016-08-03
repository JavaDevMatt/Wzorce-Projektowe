package pl.javadevmatt.builder.classic.entities;

public class Engine {
	
	// v8, v6
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	

}
