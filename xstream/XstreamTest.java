package oca.samples.xstream;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XstreamTest {
	
	public static void main(String[] args) {
		Country country = new Country();
		country.setName("Mexico");
		country.setIsoCode("MX");
		country.setCurrency("MXN");
		List<State> states = new ArrayList<State>();
		states.add(new State("Nuevo Leon", "Monterrey"));
		states.add(new State("Guanajuato", "Guanajuato"));
		country.setStates(states);
		
		XStream xStream = getXstreamObject();
		
		String xml = xStream.toXML(country);
		
		System.out.println("SerializedCountry XML:"+xml);
		
		Country  deSerializedCountry = (Country)xStream.fromXML(xml);
		
		System.out.println("DeSerializedCountry Object: "+deSerializedCountry);
	}

	private static XStream getXstreamObject() {
		XStream xstream = new XStream(new StaxDriver()); // DomDriver and StaxDriver instances also can be used with constructor
		xstream.alias("country", Country.class); // this will remove the Country class package name
		xstream.alias("state", State.class); // this will remove the State class package name
		xstream.useAttributeFor(Country.class, "isoCode"); // make the isoCode to attribute from element
		xstream.aliasField("code", Country.class, "isoCode"); // change 'isoCode' to code
		xstream.addImplicitCollection(Country.class, "states"); // don't want all states inside .
		return xstream;
	}
}