package oca.samples;

public class TestPlanetsOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet earth = new Earth();
		System.out.println(earth.rotation());
	}

}

class Planet {
	int distanceFromSun;

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
	String rotation() {

		return "The Earth rotates once every 24 hours";
	}
}

class Jupiter extends Planet {
	String rotation() {
		return "Jupiter rotates once every 9.9 hours";
	}
}
