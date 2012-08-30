package com.example.szarpidrut.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.szarpidrut.domain.Typ;
import com.example.szarpidrut.domain.Instrument;
import com.example.szarpidrut.service.InstrumentManager;
import com.example.szarpidrut.service.SellingManager;

@SessionScoped
@Named("instrumentBean")
public class InstrumentFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Instrument instrument = new Instrument();
	private ListDataModel<Instrument> instruments = new ListDataModel<Instrument>();
	
	private Instrument instrumentToShow = new Instrument();
	private ListDataModel<Instrument> descriptionInstrument = new ListDataModel<Instrument>();


	@Inject
	private InstrumentManager im;
	
//	@Inject
//	private SellingManager sm;

	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public ListDataModel<Instrument> getAllInstruments() {
		instruments.setWrappedData(im.getAllInstruments());
		return instruments;
	}
	
	public ListDataModel<Instrument> getTypInstruments() {
		instruments.setWrappedData(im.getTypInstruments());
		return instruments;
	}

//	public ListDataModel<Instrument> getDescriptionInstrument() {
//		descriptionInstrument.setWrappedData(im.getDescriptionInstrument(instrumentToShow));
//		return descriptionInstrument;	}
	
	// Actions
	public String addInstrument() {
		im.addInstrument(instrument);
		return "showInstruments";
		//return null;
	}

	public String deleteInstrument() {
		Instrument instrumentToDelete = instruments.getRowData();
		im.deleteInstrument(instrumentToDelete);
		return null;
	}
	
	public String showDetails() {
		instrumentToShow = instruments.getRowData();
		return "details";
	}
	
//	public String disposeCar(){
//		Typ typToDispose = ownedTyp.getRowData();
//		sm.disposeTyp(instrumentToShow, typToDispose);
//		return null;
//	}
}
