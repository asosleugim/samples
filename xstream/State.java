package oca.samples.xstream;

public class State {
	private String name;
	private String capital;
	
	public State(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capital
	 */
	public String getCapital() {
		return capital;
	}
	/**
	 * @param capital the capital to set
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
		.append("name:").append(name)
		.append("capital:").append(capital)
		.toString();
	}
}