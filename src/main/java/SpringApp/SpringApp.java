package SpringApp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.Animal;
import service.IServiceDAO;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		IServiceDAO service = app.getBean("serviceDAO",IServiceDAO.class);
		
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("benvenuto\nVUOI FARE:\nGET\nSET\nUPDATE\nDELETE\ndegli animali?");
			String button= keyboard.nextLine().toUpperCase();
			switch(button) {
				case "GET":
					System.out.println("vuoi vedere tutti gli animali oppure 1 dato l'id?\nTUTTI   -    ID");
					String getCase=keyboard.nextLine().toUpperCase();
					switch(getCase){
						case "TUTTI":
							System.out.println(service.getAnimals().toString());
						break;
						case "ID":
							System.out.println("inserisci l'id dell'animale che voi vedere");
							int id= Integer.parseInt(keyboard.nextLine());
							service.getAnimal(id);
						break;
					}
				break;
				
				case "SET":
					System.out.println("inserisci un nuovo animale, che specie è?:\n");
					String species= keyboard.nextLine();
					System.out.println("quanti anni ha?\n");
					int age= Integer.parseInt(keyboard.nextLine());
					service.setAnimal(new Animal(0,species,age));
				break;
				
				case "UPDATE":
					System.out.println("di che animale vuoi fare l'update?\n"+service.getAnimals().toString()+"\n digita l'id");
					int id= Integer.parseInt(keyboard.nextLine());
					System.out.println("hai scelto "+ service.getAnimal(id).toString());
					System.out.println("nuovo nome di specie?");
					String species_ = keyboard.nextLine();
					System.out.println("nuova erà?");
					int age_ = Integer.parseInt(keyboard.nextLine());
					service.updateAnimal(new Animal(id,species_,age_));
				break;
				
				case "DELETE":
					System.out.println("scegli l'id dell'animale che vuoi cancellare\n"+service.getAnimals().toString()+"\n");
					int id_= Integer.parseInt(keyboard.nextLine());
					service.deleteAnimal(id_);
			}
			
		}while(true);
		

	}

}
