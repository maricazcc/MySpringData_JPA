package it.maricazocco.MySpringData_JPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Transient;

@Entity
@NamedQuery(name = "MyUser.myNamedQuery", query = "SELECT u FROM MyUser u WHERE u.nome LIKE ?1")
//@NamedQuery(name="myUserByEta", query="SELECT u FROM MyUser u WHERE u.eta BETWEEN :myMin AND :myMax ORDER BY u.eta DESC")
public class MyUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;	
	private String nome;
	private String cognome;
	private int eta;
	@Transient //il campo non verrà salvato nel DB
	private boolean statoCivile;
	
	public MyUser() {
	}

	public MyUser(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isStatoCivile() {
		return statoCivile;
	}

	public void setStatoCivile(boolean statoCivile) {
		this.statoCivile = statoCivile;
	}

	@Override
	public String toString() {
		return "MyUser [idUser=" + idUser + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

	
	
}
