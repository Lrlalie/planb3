package fr.planb.gr.api;

import java.util.List;

import javax.jws.WebService;

import fr.planb.gr.model.Person;

@WebService(name = "IqrCodeService", targetNamespace = "http://fr.planb.gr.api")
public interface IqrCodeService {
		
	    void addPerson(Person p);
	    
	    List<Person> getPersons();
	    
	    Person getPersonByName(String name);
	    
	    List<Person> getPersonByQrCode(String qrCode);
	}


