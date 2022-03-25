

package fr.basketcreamy.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.basketcreamy.entities.pojo.ArticlePanier;
import fr.basketcreamy.entities.pojo.User;

public class ArticlePanierDao implements IArticlePanierDao{

	@Override
	public ArticlePanier addAPanier(ArticlePanier aPanier) throws Exception {


	Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "INSERT INTO aPanier (article, quantite ,user VALUES(?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		
		ps.setInt(1, aPanier.getArticle().getId());
		ps.setInt(2, aPanier.getQuantite());
		ps.setInt(5, aPanier.getUtilisateur().getId());
		
	
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
			
		if (rs.next()) {
			aPanier.setId(rs.getInt(1));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}

		return aPanier;
	}

	@Override
	public ArticlePanier updateQuantitéAPanier(ArticlePanier aPanier) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAPanier(ArticlePanier aPanier) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		String requete = "DELETE FROM aPanier WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
	
		ps.setInt(1, aPanier.getId());
		
		ps.executeUpdate();
		
	}

	@Override
	public ArticlePanier getAPanierById(Integer id) throws Exception {
			Connection connection = MyDataSource.getInstance().getConnection();
			
			String requete = "SELECT * FROM user WHERE id = ?";
			PreparedStatement ps = connection.prepareStatement(requete);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			ArticlePanier aPanier = null;
			if (rs.next()) {
				aPanier = new ArticlePanier();
				aPanier.setId(rs.getInt("id"));
				aPanier.setArticleId(rs.getInt("article"));
				aPanier.setQuantite(rs.getInt("quantite"));
				aPanier.setUtilisateurId(rs.getInt("user"));

			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
			return aPanier;
		}


	@Override
	public List<ArticlePanier> getAPanierByUtilisateur(Integer userId) throws Exception {

			
			Connection connection = MyDataSource.getInstance().getConnection();
			
			String requete = "SELECT * FROM aPanier WHERE utilsateur_id = ?";
			
			PreparedStatement ps = connection.prepareStatement(requete);
			
			ps.setInt(1, userId);	
			
			Statement st = connection.createStatement();

			ResultSet rs = st.executeQuery(requete);
			
			List<ArticlePanier> panierList = new ArrayList<>();
			
			while (rs.next()) {
				
				Integer aPanierId = rs.getInt("article_panier_id");
				Integer articleId = rs.getInt("article");
				Integer quantite = rs.getInt("quantité");
				
				try {
					ArticlePanier aPanier = new ArticlePanier (aPanierId,articleId, quantite, userId);
					panierList.add(aPanier);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return panierList ;
		}

	@Override
	public ArticlePanier getAPanierByUtilisateur(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}