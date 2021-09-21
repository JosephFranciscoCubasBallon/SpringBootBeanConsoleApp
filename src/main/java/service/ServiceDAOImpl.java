package service;

import java.util.List;

import entities.Animal;
import entities.Entity;
import repository.IRepositoryDAO;

public class ServiceDAOImpl implements IServiceDAO{
	
	IRepositoryDAO repository;
	
	public ServiceDAOImpl(IRepositoryDAO repository) {
		this.repository=repository;
	}

	public void setRepository(IRepositoryDAO repository) {
		this.repository = repository;
	}

	@Override
	public void setAnimal(Entity animal) {
		repository.setAnimal(animal);
	}

	@Override
	public Animal getAnimal(int id) {
		return repository.getAnimal(id);
	}

	@Override
	public void updateAnimal(Entity animal) {
		repository.updateAnimal(animal);	
	}

	@Override
	public boolean deleteAnimal(int id) {
		return repository.deleteAnimal(id);
	}

	@Override
	public List<Entity> getAnimals() {
		return repository.getAnimals();
	}

}
