package entities;

public class Animal extends Entity {
	
	private String species;
	private int age;
	
	public Animal(int id, String species, int age) {
		super(id);
		this.species = species;
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + "]  ----- "+ super.toString() +"   \n";
	}
	
}
