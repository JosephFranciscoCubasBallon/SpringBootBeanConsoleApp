package SpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import repository.IRepositoryDAO;
import repository.RepositoryDAOImpl;
import service.IServiceDAO;
import service.ServiceDAOImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="serviceDAO")
	IServiceDAO getService() {
		return new ServiceDAOImpl(getRepository());
	}
	
	@Bean(name="repositoryDAO")
	IRepositoryDAO getRepository() {
		return new RepositoryDAOImpl();
	}

}
