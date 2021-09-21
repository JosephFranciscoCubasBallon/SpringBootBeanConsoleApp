package repository;

import java.util.List;

import entities.Animal;
import entities.Entity;

public interface IRepositoryDAO {
	
	void setAnimal(Entity animal);
	Animal getAnimal(int id);
	void updateAnimal(Entity animal);
	boolean deleteAnimal(int id);
	
	List<Entity> getAnimals();

}
