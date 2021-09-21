package repository;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Entity;

public class RepositoryDAOImpl implements IRepositoryDAO{
	
	List<Entity> animals = new ArrayList<Entity>();

	@Override
	public void setAnimal(Entity animal) {
		int id=0;
		if(animals.size()>=0) {
			for(int i=0;i<=animals.size();i++) {
				++id;
			}
			animal.setId(id);
			animals.add(animal);
		}
		else
			System.out.println("non puoi mettere un id =<0");
	}

	@Override
	public Animal getAnimal(int id) {
		if(id>=0 && id<animals.size()) {
			for(int i=0;i<animals.size();i++) {
				if(animals.get(i).getId()==id)
					return (Animal)animals.get(i);
			}
		}
		else
			System.out.println("errore, id troppo alto o troppo basso");
		return null;
	}

	@Override
	public void updateAnimal(Entity animal) {
		Animal animal_ = (Animal) animal;
		getAnimal(animal.getId()).setAge(animal_.getAge());
		getAnimal(animal.getId()).setSpecies(animal_.getSpecies());		
	}

	@Override
	public boolean deleteAnimal(int id) {
		for(int i=0;i<animals.size();i++) {
			if(animals.get(i).getId()==id) {
				animals.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Entity> getAnimals() {
		return animals;
	}
	

}
