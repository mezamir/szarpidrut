package com.example.szarpidrut.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.szarpidrut.domain.Typ;
import com.example.szarpidrut.domain.Instrument;


/* 
 * This is a Stateless EJB Bean
 * All its methods are transactional
 */
@Stateless
public class TypManager {

	@PersistenceContext
	EntityManager em;
//	public void sellTyp(Long instrumentId, Long typId) {

//		Instrument instrument = em.find(Instrument.class, instrumentId);
//		Typ typ = em.find(Typ.class, typId);
//		typ.setSold(true);

//		instrument.getTypy().add(typ);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Typ> getAvailableTyp() {
//		return em.createNamedQuery("car.unsold").getResultList();
//	}
//
//	public void disposeTyp(Instrument instrument, Typ typ) {
//
//		instrument = em.find(Instrument.class, instrument.getId());
//		typ = em.find(Typ.class, typ.getId());
//
//		Typ toRemove = null;
		// lazy loading here (person.getCars)
//		for (Typ aTyp : instrument.getTypy())
//			if (aTyp.getId().compareTo(typ.getId()) == 0) {
//				toRemove = aTyp;
//				break;
//			}
//
//		if (toRemove != null)
//			instrument.getTypy().remove(toRemove);
//		
//		typ.setSold(false);
//	}
}
