package fr.basketcreamy.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.basketcreamy.cryptage.model.connection.MyDataSource;
import fr.basketcreamy.entities.pojo.User;
import fr.basketcreamy.enums.EnumProfil;

public class UserDao implements IUserDao {

	@Override
	public User addUtilisateur(User user) throws Exception {
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "INSERT INTO utilisateur(nom, prenom, email, password, profil, telephone) VALUES(?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, user.getNom());
		ps.setString(2, user.getPrenom());
		ps.setString(3, user.getEmail());
		ps.setBytes(4, user.getPassword());
		ps.setString(5, EnumProfil.CLIENT.getProfil());
		ps.setString(6, user.getTelephone());
		
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		
		//Ajout Adresse
		//Ajout Carte Paiement
		if (rs.next()) {
			user.setId(rs.getInt(1));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		
		user.setProfil(EnumProfil.CLIENT.getProfil());
		//user.setId(5);
		return user;
	}
}
