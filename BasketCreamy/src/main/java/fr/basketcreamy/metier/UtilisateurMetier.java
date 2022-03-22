package fr.basketcreamy.metier;

import java.security.Key;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import fr.basketcreamy.cryptage.algo.AlgorithmeCryptage;
import fr.basketcreamy.cryptage.model.connection.MyDataSource;
import fr.basketcreamy.entities.Utilisateur;
import fr.basketcreamy.enums.EnumCryptage;

public class UtilisateurMetier implements IUtilisateurMetier {

	private IParams params = new Params();
	
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		String requete = "INSERT INTO utilisateur(nom, prenom, dateNaissance, isActif, profil, email, password, telephone) VALUES(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setString(3, utilisateur.getDateNaissance());
		ps.setBoolean(4, utilisateur.isActif());
		//ps.setLong(5, utilisateur.getProfil());
		ps.setString(6, utilisateur.getEmail());
		ps.setString(7, utilisateur.getTelephone());
		
		byte[] cleCryptage = params.getCleCryptagePwd();
		SecretKey key = new SecretKeySpec(cleCryptage, 0, cleCryptage.length, EnumCryptage.AES.getAlgorithm());
		byte[] passwordCrypte = AlgorithmeCryptage.encrypt(utilisateur.getPassword().toString(), key, EnumCryptage.AES.getAlgorithm());
		utilisateur.setPassword(passwordCrypte);
		
		ps.setBytes(8, utilisateur.getPassword());
		
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			utilisateur.setId(rs.getInt(1));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return utilisateur;
	}

	@Override
	public Utilisateur seConnecter(String email, String password) throws Exception {
		Utilisateur user = Utilisateur.getUserByEmail(email);
		if (user != null) {
			byte[] cleCryptage = params.getCleCryptagePwd();
			Key key = new SecretKeySpec(cleCryptage, EnumCryptage.AES.getAlgorithm());
			String passwordDataBase = AlgorithmeCryptage.decrypt(user.getPassword(), key, EnumCryptage.AES.getAlgorithm());
			if (passwordDataBase.equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public Utilisateur seDeconnecter(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
