package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.IDepartementDao;
import tn.enig.dao.IEmployeeDao;
import tn.enig.dao.IProjetDao;
import tn.enig.model.Departement;
import tn.enig.model.Employee;

import tn.enig.model.Projet;


@Controller
public class AppController {
	
	@Autowired
	IDepartementDao daod;
	
	@Autowired
	IEmployeeDao daoe;
		
	@Autowired
	IProjetDao daop;
	
	public void setDaod(IDepartementDao daod) {
		this.daod = daod;
	}
	
	public void setDaoe(IEmployeeDao daoe) {
		this.daoe=daoe;
	}
	
	public void setDaop(IProjetDao daop) {
		this.daop = daop;
	}

	
	@GetMapping("/home")
	public String get1(Model m) {
		List<Departement> liste1=daod.findAll();
		System.out.println(liste1);
		m.addAttribute("liste",liste1);
		return "home"; 
	}
	
	

	
	@GetMapping("/employes/dept/{id}")
	public String get2(Model m,@PathVariable("id") int id) {
		List<Employee> liste=  daoe.getAllEmployeeByDept(id);
		Departement dept = daod.findOne(id);
		m.addAttribute("deptName", dept.getNom());
		m.addAttribute("liste", liste);
		return "deptEmployes";
		
	}
	

	@GetMapping("/dept/{id}/projet")
	public String get3(Model m,@PathVariable("id") int id) {
		List<Projet> liste=  daop.getAllProjetByDept(id);
		Departement dept = daod.findOne(id);
		m.addAttribute("deptName", dept.getNom());
		m.addAttribute("liste", liste);
		return "deptProjet";
		
	}
	
	@GetMapping("/dept/{id}/employee")
	public String get4(Model m,@PathVariable("id") int id) {
		List<Employee> liste=  daoe.getAllEmployeeByProjet(id);
		Projet pr = daop.findOne(id);
		m.addAttribute("prtName", pr.getTitre());
		m.addAttribute("liste", liste);
		return "prtEmployes";
		
	}
	
	@GetMapping("ajoutEmployee")
	public String get7(Model m) {
		Employee e = new Employee();
		List<Projet> listep=daop.findAll();
		List<Departement> listed=daod.findAll();
		String[] listef={"Manager", "Ing", "Technicien"};

		m.addAttribute("employee", e);
		m.addAttribute("listeProjet", listep);
		m.addAttribute("listeDepartement", listed);
		m.addAttribute("listeFonction", listef);

		return "ajoutEmployee";
	}
	
	@PostMapping("saveEmployee")
	public String get4(Model m, @ModelAttribute("employee") Employee e) {
		daoe.save(e);
		return "redirect:/home";
		
	}
	
	@GetMapping("ajoutProjet")
	public String get8(Model m) {
		Projet p = new Projet();
		List<Departement> listed=daod.findAll();
		String[] listeet={"En cour", "Termine", "Probleme"};
		m.addAttribute("projet", p);

		m.addAttribute("listeDepartement", listed);
		m.addAttribute("listeEtat", listeet);

		return "ajoutProjet";
	}
	
	@PostMapping("saveProjet")
	public String get9(Model m, @ModelAttribute("projet") Projet p) {
		daop.save(p);
		return "redirect:/home";
		
	}
	
}
