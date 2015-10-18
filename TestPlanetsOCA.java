package oca.samples;

import java.io.ObjectInputStream.GetField;

public class TestPlanetsOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet planetEarth = new Earth();
		planetEarth = planetEarth.getPlanet();
		//System.out.println(planetEarth.rotation());
		Earth earthObject = (Earth)planetEarth;
		
		Planet objectB = new Planet();
		
		Earth A = (Earth) objectB.getPlanet();
		
		
		
	System.out.println("Planeta "+earthObject.getName());	
	}

}

class Planet {
	int distanceFromSun;
	Planet planetObject;
	
	Planet getPlanet(){
		return planetObject;
	}

	Planet() {
		System.out.println("This is a Planet");
	}

	Planet(int pDistance) {
		distanceFromSun = pDistance;
	}

	String rotation() {
		return "a planet rotates";
	}
}

class Earth extends Planet {
	
	String name;
	Earth objectEarth;
	Planet objectPlanet;
	public Planet getObjectPlanet(){
		return objectPlanet;
	}
	public Earth getObjectEarth() {
		return objectEarth;
	}
	public void setObjectEarth(Earth objectEarth) {
		this.objectEarth = objectEarth;
	}
	public String getName() {
		return "Miguel";
	}
	public void setName(String name) {
		this.name = name;
	}
	String rotation() {

		return "The Earth rotates once every 24 hours";
	}
}

class Jupiter extends Planet {
	String rotation() {
		return "Jupiter rotates once every 9.9 hours";
	}
}
