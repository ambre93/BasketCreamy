package fr.basketcreamy.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.basketcreamy.cryptage.model.connection.MyDataSource;
import fr.basketcreamy.entities.Utilisateur;


public class UtilisateurMetier implements IUtilisateurMetier {

	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		String requete = "INSERT INTO utilisateur(nom, prenom, dateNaissance, isActif, profil, email, password, telephone, adresses, commandes, cartesDePaiement, commentaires, panier) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setString(3, utilisateur.getDateNaissance());
		ps.setBoolean(4, utilisateur.isActif());
		//ps.setLong(5, utilisateur.getProfil());
		ps.setString(6, utilisateur.getEmail());
		ps.setString(7, utilisateur.getTelephone());
		//ps.setString(8, utilisateur.getAdresses());
		//ps.setBytes(9, utilisateur.getCommandes());
		//ps.setBytes(10, utilisateur.getCartesDePaiement());
		//ps.setBytes(11, utilisateur.getCommentaires());
		//ps.setBytes(12, utilisateur.getPanier());
		//ps.setBytes(13, utilisateur.getPassword());
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur seDeconnecter(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
