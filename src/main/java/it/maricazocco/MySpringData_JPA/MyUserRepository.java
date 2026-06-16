package it.maricazocco.MySpringData_JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

public interface MyUserRepository extends JpaRepository<MyUser, Integer>{ //indichiamo la classe e il tipo dell'id
	
	public List<MyUser> findByNome(String nome);	
	public List<MyUser> findByCognome(String cognome);
	public List<MyUser> findByEta(int eta);	
	public List<MyUser> findByNomeAndEta(String nome, Integer eta);	
	public List<MyUser> findByEtaGreaterThanEqual (Integer eta);
	public List<MyUser> findByEtaBetweenOrderByEta(Integer etaMin, Integer etaMax);	
	//@Transactional: dichiara che il metodo o la classe eseguono transazioni SQL
	@Transactional
	public Integer deleteByEta(int eta);
	
	/* NamedQuery */

	public List<MyUser> myNamedQuery(String string);
 

}
