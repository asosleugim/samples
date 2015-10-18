package oca.samples.designpatters.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		SingleObject object2 = SingleObject.getInstance();

		
		object.showMessage();

		
		if(object == object2){
			System.out.println("Same object instance:");
			System.out.println(object + " \n"+ object2);
		}
	}

}
