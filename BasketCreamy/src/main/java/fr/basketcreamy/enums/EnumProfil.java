package fr.basketcreamy.enums;

public enum EnumProfil {
	
	CLIENT ("Client"),
	ADMIN ("Admin"),
	MAGASINIER ("Magasinier");
	
	private String profil;

	private EnumProfil(String profil) {
		this.profil = profil;
	}

	public String getProfil() {
		return profil;
	}

}
