package fr.basketcreamy.metier;

import java.security.Key;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;

import fr.basketcreamy.cryptage.keys.GenerateKeys;
import fr.basketcreamy.enums.EnumCryptage;
import fr.basketcreamy.model.connection.MyDataSource;

public class Params implements IParams {

	@Override
	public byte[] getCleCryptagePwd() throws Exception {
			
		String requete = "SELECT cle_cryptage_pwd FROM params";
		Connection connection = MyDataSource.getInstance().getConnection();
		PreparedStatement ps = connection.prepareStatement(requete);
		ResultSet rs = ps.executeQuery();
		byte[] cle_cryptage_pwd = null;
		if (rs.next()) {
			cle_cryptage_pwd = rs.getBytes("cle_cryptage_pwd");
		} else {
			Key key = GenerateKeys.generateKeyCryptage(EnumCryptage.AES.getAlgorithm(), 128);
			cle_cryptage_pwd = key.getEncoded();
			addCleCryptagePwd(cle_cryptage_pwd);
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return cle_cryptage_pwd;
	}

	@Override
	public byte[] getCleCryptageCp() throws Exception {
		String requete = "SELECT cle_cryptage_cp FROM params";
		Connection connection = MyDataSource.getInstance().getConnection();
		PreparedStatement ps = connection.prepareStatement(requete);
		ResultSet rs = ps.executeQuery();
		byte[] cle_cryptage_cp = null;
		if (rs.next()) {
			cle_cryptage_cp = rs.getBytes("cle_cryptage_cp");
		} else {
			Key key = GenerateKeys.generateKeyCryptage(EnumCryptage.AES.getAlgorithm(), 128);
			cle_cryptage_cp = key.getEncoded();
			addCleCryptageCp(cle_cryptage_cp);
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return cle_cryptage_cp;
	}

	private void addCleCryptagePwd(byte[] cleCryptagePwd) throws Exception {
		
		String requete = "INSERT INTO params(cle_cryptage_pwd) VALUES(?)";
		Connection connection = MyDataSource.getInstance().getConnection();
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setBytes(1, cleCryptagePwd);
		ps.executeUpdate();
		
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}
	
	private void addCleCryptageCp(byte[] cleCryptageCp) throws Exception {
		
		String requete = "INSERT INTO params(cle_cryptage_cp) VALUES(?)";
		Connection connection = MyDataSource.getInstance().getConnection();
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setBytes(1, cleCryptageCp);
		ps.executeUpdate();
		
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}
}
