package fr.basketcreamy.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import fr.basketcreamy.entities.pojo.User;
import fr.basketcreamy.entities.pojo.User2;
import fr.basketcreamy.enums.EnumProfil;
import fr.basketcreamy.model.connection.MyDataSource;

@Stateless
public class UserDao implements IUserDao {

	//@PersistenceContext(unitName = "MySqlPersistence")
	//private EntityManager em;
	
	@Override
	public void addUtilisateur(User2 user) throws Exception {
		EntityManager em = MyDataSource.getInstance().getEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(user);
		tx.commit();
	}

	@Override
	public void removeUtilisateur(int userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByEmail(String email) throws Exception {
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM user WHERE email = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setString(1, email);
		
		ResultSet rs = ps.executeQuery();
		User user = null;
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt("id"));
			user.setNom(rs.getString("nom"));
			user.setPrenom(rs.getString("prenom"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getBytes("password"));
			user.setProfil(rs.getString("profil"));
			user.setTelephone(rs.getString("telephone"));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return user;
	}
	
	
	public static User getUserById(Integer userId) throws Exception {
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM user WHERE utilisateur_id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setInt(1, userId);
		
		ResultSet rs = ps.executeQuery();
		User user = null;
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt("id"));
			user.setNom(rs.getString("nom"));
			user.setPrenom(rs.getString("prenom"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getBytes("password"));
			user.setProfil(rs.getString("profil"));
			user.setTelephone(rs.getString("telephone"));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return user;
	}
}
