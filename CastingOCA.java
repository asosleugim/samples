package oca.samples;

public class CastingOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      Animal a = new Dog();
		      Animal DoggieAnimal = new Dog();
		      
		      Dog doggie = new Dog();
		     
		      Animal animal = new Animal(); 
		      
		      
		      DoggieAnimal = (Dog) a;
		      
		      //Doganimal = animal;
		      
	
		      
		      //	      Doganimal.setBarks("sound");
		      
		      
		  //    Dog dog = (Dog)animal;
		      
		      
		      
		      
		      
		      
		      
		      Dog b = new Dog();
		      a.a = (int)b.b;
			      b = (Dog)a;
			      System.out.println(b.b + " ; " + a.a);
			   }
		}
	 class Animal {
		   int a = 2;
		   private Integer sleepHours;
	 }
	 
	 class Dog extends Animal {
	   double b;
	   private String barks;
		   public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getBarks() {
		return barks;
	}
	public void setBarks(String barks) {
		this.barks = barks;
	}
		Dog() {
		       this.b = 4.0;
			   }
			 


	
	 }

