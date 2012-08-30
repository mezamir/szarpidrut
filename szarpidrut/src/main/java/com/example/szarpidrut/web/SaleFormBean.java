package com.example.szarpidrut.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.szarpidrut.domain.Typ;
import com.example.szarpidrut.domain.Instrument;
import com.example.szarpidrut.service.InstrumentManager;
import com.example.szarpidrut.service.SellingManager;

@SessionScoped
@Named("saleBean")
public class SaleFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private SellingManager sm;

	@Inject
	private InstrumentManager im;

	private Long typId;
	private Long instrumentId;
	
	public Long getTypId() {
		return typId;
	}
	public void setTypId(Long typId) {
		this.typId = typId;
	}
	public Long getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(Long instrumentId) {
		this.instrumentId = instrumentId;
	}

//	public List<Typ> getAvailableTyp() {
//		return sm.getAvailableTyp();
//	}

	public List<Instrument> getAllInstruments() {
		return im.getAllInstruments();
	}
	
	public List<Instrument> getDescriptionInstrument() {
		return im.getDescriptionInstrument();
	}

//	public String sellCar() {
//		sm.sellCar(personId, carId);
//		return null;
//	}
}
