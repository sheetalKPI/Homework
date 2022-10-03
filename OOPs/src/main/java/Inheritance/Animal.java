package Inheritance;

public class Animal {

	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	public Animal() {}

		public Animal(boolean veg, String food, int legs)
		{
			this.vegetarian = veg;
			this.eats = food;
			this.noOfLegs = legs;
		}
		public boolean isVegetarian() 
		{
			return vegetarian;
	}
		public void setvegetarian(boolean vegetarian) 
		{
			this.vegetarian = vegetarian;
		}
		public String getEats()
		{
		 return eats;
		}
		public void setEats(String eats)
		{
			this.eats = eats;
		}
		public int getNoOfLegs()
		{
			return noOfLegs;
		}
		public void setOfLegs(int noOfLegs) {
			this.noOfLegs = noOfLegs;
		}
	}
