package fr.basketcreamy.entities.dao;

import fr.basketcreamy.entities.pojo.User;
import fr.basketcreamy.enums.EnumProfil;

public class UserDao implements IUserDao {

	@Override
	public User addUtilisateur(User user) throws Exception {
		//TODO
		user.setProfil(EnumProfil.CLIENT.getProfil());
		user.setId(5);
		return user;
	}
}
