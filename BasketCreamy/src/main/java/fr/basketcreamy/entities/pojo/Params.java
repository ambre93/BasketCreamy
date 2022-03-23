package fr.basketcreamy.entities.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "params")
public class Params {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private byte[] cle_cryptage_pwd;
	private byte[] cle_cryptage_cp;
	
	
	public Params() {
		
	}


	public Params(byte[] cle_cryptage_pwd, byte[] cle_cryptage_cp) {
		super();
		this.cle_cryptage_pwd = cle_cryptage_pwd;
		this.cle_cryptage_cp = cle_cryptage_cp;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public byte[] getCle_cryptage_pwd() {
		return cle_cryptage_pwd;
	}


	public void setCle_cryptage_pwd(byte[] cle_cryptage_pwd) {
		this.cle_cryptage_pwd = cle_cryptage_pwd;
	}


	public byte[] getCle_cryptage_cp() {
		return cle_cryptage_cp;
	}


	public void setCle_cryptage_cp(byte[] cle_cryptage_cp) {
		this.cle_cryptage_cp = cle_cryptage_cp;
	}

	
}
