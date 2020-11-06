package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Departement;

@Repository
public interface IDepartementDao extends JpaRepository<Departement, Integer>{

}
