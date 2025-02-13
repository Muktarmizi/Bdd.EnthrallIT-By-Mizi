package constants;

public enum Attribute {

	MAX_LENGTH("maxlength"), INNER_HTML("innerHTML");

	String attribute;

	private Attribute(String attribute) {
		this.attribute = attribute;
	}

	public String getTheAttribute() {
		return attribute;
	}

	@Override
	public String toString() {
		return attribute;
	}

}

