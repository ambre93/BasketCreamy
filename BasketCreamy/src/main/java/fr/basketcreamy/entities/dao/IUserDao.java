package fr.basketcreamy.entities.dao;

import fr.basketcreamy.entities.pojo.User;

public interface IUserDao {
	User addUtilisateur(User user) throws Exception;
	void removeUtilisateur(int userId) throws Exception;
	User getUserByEmail(String email) throws Exception;
	//User getUserById(Integer userId) throws Exception;
}
