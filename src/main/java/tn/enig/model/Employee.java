package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@OneToOne
	@JoinColumn(name="projet_id")
	private Projet pr;
	@OneToOne
	@JoinColumn(name="departement_id")
	private Departement dept;
	private String fonction;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String nom, Projet pr, Departement dept, String fonction) {
		super();
		this.id = id;
		this.nom = nom;
		this.pr = pr;
		this.dept = dept;
		this.fonction = fonction;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Projet getPr() {
		return pr;
	}
	public void setPr(Projet pr) {
		this.pr = pr;
	}
	public Departement getDept() {
		return dept;
	}
	public void setDept(Departement dept) {
		this.dept = dept;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	
}
