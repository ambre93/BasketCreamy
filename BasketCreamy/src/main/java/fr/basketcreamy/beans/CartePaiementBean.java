package fr.basketcreamy.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "carteBean")
@SessionScoped
public class CartePaiementBean {
	
	private String numCarte;
	private String dateValidite;
	private String crypto;
	public CartePaiementBean() {
	
	}
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	public String getDateValidite() {
		return dateValidite;
	}
	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}
	public String getCrypto() {
		return crypto;
	}
	public void setCrypto(String crypto) {
		this.crypto = crypto;
	}
	
	

}
