package fr.planb.gr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.planb.gr.model.Person;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//pour rappel le 1er Person = type de l'objet, le 2nd = le constructeur de la classe Person
		Person personne = new Person();
		//on utilise désormais chaque attribut et on lui donne une valeur 
		personne.setFirstName("Noémie");
		personne.setLastName("Demole");
		
		
	}

}
