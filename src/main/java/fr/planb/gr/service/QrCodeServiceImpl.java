package fr.planb.gr.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import fr.planb.gr.api.IqrCodeService;
import fr.planb.gr.model.Person;

@WebService(
		endpointInterface = "fr.planb.gr.api.NotebookService.IqrCodeService",
		serviceName = "IqrCodeService",
		portName = "QrCodeService")
		public class QrCodeServiceImpl implements IqrCodeService {
	  
	@Override
	public void addPerson(Person p) {
		if (p == null) {
			throw new NullPointerException("Person is null");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("addPerson method has been invoked : " + p.toString());
		}


	@Override
	public Person getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByQrCode(String qrCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}
}
