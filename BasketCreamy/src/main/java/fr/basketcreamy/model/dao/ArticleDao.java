package fr.basketcreamy.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.basketcreamy.entities.pojo.Article;

public class ArticleDao implements IArticleDao{

	@Override
	public Article addArticle(Article article) throws Exception {
		
	Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "INSERT INTO adresse(nom, description,prix ,remise ,stock ,isVendable ,photos , videos VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, article.getNom());
		ps.setString(2, article.getDescription());
		ps.setDouble(3,article.getPrix());
		ps.setInt(4, article.getRemise());
		ps.setInt(5, article.getStock());		
		ps.setBoolean(6, article.getIsVendable());
		ps.setString(7,article.getPhotos());
		ps.setString(8, article.getVideos());

		//ps.setInt(5, article.getUser().getId())
		
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
			
		if (rs.next()) {
			article.setId(rs.getInt(1));
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}

		return article;
		
		
	
	}

	@Override
	public Article updateArticle(Article article) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "UPDATE adresse set adresse_id = ? nom, description = ? prix = ? remise = ? stock = ? isVendable = ? photos = ? videos = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		
		ps.setString(1, article.getNom());
		ps.setString(2, article.getDescription());
		ps.setDouble(3,article.getPrix());
		ps.setInt(4, article.getRemise());
		ps.setInt(5, article.getStock());		
		ps.setBoolean(6, article.getIsVendable());
		ps.setString(7,article.getPhotos());
		ps.setString(8, article.getVideos());
		
		
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return article;
	
		
	}

	@Override
	public void deleteArticle(Article article) throws Exception {
		
		Connection connection = MyDataSource.getInstance().getConnection();
		String requete = "DELETE FROM article WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
	
		ps.setInt(1, article.getId());
		
		int result = ps.executeUpdate();
		
	}

	@Override
	public Article getArticleById(Integer id) throws Exception {
		Connection connection = MyDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM  article WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		Article article = null;
		
		if (rs.next()) {
			article = new Article();
		
			article.setNom(rs.getString("nom"));
			article.setDescription(rs.getString("description"));
			article.setPrix(rs.getDouble("prix"));
			article.setRemise(rs.getInt("remise"));
			article.setStock(rs.getInt("stock"));		
			article.setIsVendable(rs.getBoolean("isVendable"));
			article.setPhotos(rs.getString("Photos"));
			article.setVideos(rs.getString("videos"));
		
			
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
		return article;
	}
}
