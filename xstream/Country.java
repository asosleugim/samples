package oca.samples.xstream;

import java.util.List;

public class Country {
	private String name;
	private String isoCode;
	private String currency;
	private List states;
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
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return isoCode;
	}
	/**
	 * @param isoCode the isoCode to set
	 */
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the states
	 */
	public List getStates() {
		return states;
	}
	/**
	 * @param states the states to set
	 */
	public void setStates(List states) {
		this.states = states;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
		.append("name:").append(name)
		.append(",isoCode:").append(isoCode)
		.append(",currency:").append(currency)
		.append(",states:").append(states)
		.toString();
	}
}