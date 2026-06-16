package it.maricazocco.MySpringData_JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCRUD implements CommandLineRunner{
	
	@Autowired
	MyUserRepository myUserRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//myUserRepository.save(new MyUser("Joe","Blue", 45));
		
		System.out.println(myUserRepository.findById(2));
		
		System.out.println(myUserRepository.count());

		System.out.println(myUserRepository.existsById(1));
	
		//myUserRepository.deleteById(4);		
		myUserRepository.findAll().forEach(myUser -> System.out.println(myUser));
		
		/* Per composizione*/
		System.out.println("findByNome: " + myUserRepository.findByNome("Aldo"));		
		System.out.println("findByEta: " + myUserRepository.findByEta(36));	
		System.out.println("findByNomeAndEta: " + myUserRepository.findByNomeAndEta("Aldo", 43));
		System.out.println("findByEtaGreaterThanEqual: " + myUserRepository.findByEtaGreaterThanEqual(43));
		System.out.println("findByEtaBetweenOrderByEta: " + myUserRepository.findByEtaBetweenOrderByEta(42, 44));
		System.out.println("deleteByEta: " + myUserRepository.deleteByEta(36));
		
		/* Custom Query JPQL 
		List<String> myUsersNomeByEta =  myUserRepository.myFindNomeByEta(44);
		myUsersNomeByEta.forEach(myUserNome -> System.out.println(myUserNome));
		System.out.println("--------------------------------------------------");	
		myUserRepository.myUpdateUserById("Alfio", "Marroni", 55, 2);	
		myUserRepository.mySaveUser("Ajeje", "Brazorf", 33);*/
			
		/* Named Query */
		System.out.println("myNamedQuery: " + myUserRepository.myNamedQuery("Al%"));
 
 		 
		
	}
 
	

}
