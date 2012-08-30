package com.example.szarpidrut.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.szarpidrut.domain.Typ;
import com.example.szarpidrut.domain.Instrument;

@Stateless
public class InstrumentManager {

	@PersistenceContext
	EntityManager em;

	public void addInstrument(Instrument instrument) {
		instrument.setId(null);
		em.persist(instrument);
	}

	public void deleteInstrument(Instrument instrument) {
		instrument = em.find(Instrument.class, instrument.getId());
		em.remove(instrument);
	}

	@SuppressWarnings("unchecked")
	public List<Instrument> getAllInstruments() {
		return em.createNamedQuery("instrument.all").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Instrument> getDescriptionInstrument() {
		return em.createNamedQuery("instrument.description").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Instrument> getTypInstruments() {
		return em.createNamedQuery("instrument.typ").getResultList();
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Typ> getNazwaTyp() {
//		return em.createNamedQuery("typ.id").getResultList();
//	}
	
//	public List<Typ> getOwnedTyp(Instrument instrument) {
//		instrument = em.find(Instrument.class, instrument.getId());
//		// lazy loading here - try this code without this (shallow) copying
//		List<Typ> typy = new ArrayList<Typ>(instrument.getTypy());
//		return typy;
//	}

}
