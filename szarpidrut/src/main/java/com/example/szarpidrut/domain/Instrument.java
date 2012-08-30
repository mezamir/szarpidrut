package com.example.szarpidrut.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.example.szarpidrut.domain.Typ;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "instrument.all", query = "Select i from Instrument i"), 
	@NamedQuery(name = "instrument.description", query = "Select description from Instrument i"),
	@NamedQuery(name = "instrument.typ", query = "Select distinct typ from Instrument i")
})
public class Instrument {

	private Long id;

	private String name = "podaj nazwę";
	private String brand = "podaj markę";
	private String typ = null;
	private Date registrationDate = new Date();
	private String description = "podaj opis przedmiotu";

//	private List<Typ> typy = new ArrayList<Typ>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Size(min = 2, max = 20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Size(min = 2)
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Size(min = 2)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	// Be careful here, both with lazy and eager fetch type
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	public List<Typ> getTypy() {
//		return typy;
//	}
//	public void setTypy(List<Typ> typy) {
//		this.typy = typy;
//	}
}
