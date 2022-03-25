package fr.basketcreamy.model.dao;

import fr.basketcreamy.entities.pojo.User;
import fr.basketcreamy.entities.pojo.User2;

public interface IUserDao {
	void addUtilisateur(User2 user) throws Exception;
	void removeUtilisateur(int userId) throws Exception;
	User getUserByEmail(String email) throws Exception;
	//User getUserById(Integer userId) throws Exception;
}
