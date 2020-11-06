package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Projet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private String etat;
	@OneToOne
	@JoinColumn(name="departement_id")
	private Departement dep;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(Integer id, String titre, String etat, Departement dep) {
		super();
		this.id = id;
		this.titre = titre;
		this.etat = etat;
		this.dep = dep;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Departement getDep() {
		return dep;
	}
	public void setDep(Departement dep) {
		this.dep = dep;
	}
	
	
}
