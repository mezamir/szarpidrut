package com.example.szarpidrut.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "typ.join", query = "SELECT name, typ.nazwa FROM instrument JOIN typ ON instrument.id_typ = typ.id")
public class Typ {
	
	private Long id;
	private String nazwa;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
//	public Boolean getSold() {
//		return sold;
//	}
//	public void setSold(Boolean sold) {
//		this.sold = sold;
//	}
}
