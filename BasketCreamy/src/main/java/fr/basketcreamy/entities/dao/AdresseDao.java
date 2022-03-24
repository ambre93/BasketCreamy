

package fr.basketcreamy.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.basketcreamy.cryptage.model.connection.MyDataSource;
import fr.basketcreamy.entities.pojo.Adresse;
import fr.basketcreamy.entities.pojo.User;

public class AdresseDao implements IAdresseDao{

	@Override
	public Adresse addAdresse(Adresse adresse) throws Exception {

		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "INSERT INTO adresse(numero , rue , ville , codePostal , utilisateur) VALUES(?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, adresse.getNumero());
		ps.setString(2, adresse.getRue());
		ps.setString(3, adresse.getVille());
		ps.setString(4, adresse.getCodePostal());
		ps.setInt(5, adresse.getUser().getId());

		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
			
		if (rs.next()) {
			adresse.setId(rs.getInt(1));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}

		return adresse;
	}

	@Override
	public Adresse updateAdresse(Adresse adresse) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "UPDATE adresse set numero = ?, rue = ?, ville = ?, codePostal = ?, utilisateur = ? WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		
		ps.setString(1, adresse.getNumero());
		ps.setString(2, adresse.getRue());
		ps.setString(3, adresse.getVille());
		ps.setString(4, adresse.getCodePostal());
		ps.setInt(5, adresse.getUser().getId());
		
		ps.executeUpdate();
		
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return adresse;
	}

	@Override
	public void deleteAdresse(Adresse adresse) throws Exception {
		Connection connection = MyDataSource.getInstance().getConnection();
		String requete = "DELETE FROM adresse WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
	
		ps.setInt(1, adresse.getId());
		
		int result = ps.executeUpdate();
	}

	@Override
	public Adresse getAdressById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse getAdresByEmail(String Email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> getAllByUser(Integer userId) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM adresse WHERE utilsateur_id = ?";
		
		PreparedStatement ps = connection.prepareStatement(requete);
		
		ps.setInt(1, userId);	
		
		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery(requete);
		
		List<Adresse> adresses = new ArrayList<>();
		while (rs.next()) {
			
			Integer adresseId = rs.getInt("adresse_id");
			String numero = rs.getString("numero");
			String rue = rs.getString("rue");
			String ville = rs.getString("ville");
			String codePostal = rs.getString("code_postal");
			
			User user = null;
			try {
				user = UserDao.getUserById(userId);
				Adresse adressList = new Adresse (adresseId, numero, rue, ville, codePostal, user);
				adresses.add(adressList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return adresses;
	}


}
