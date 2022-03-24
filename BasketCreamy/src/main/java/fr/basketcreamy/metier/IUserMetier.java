package fr.basketcreamy.metier;

import fr.basketcreamy.entities.dto.UserDto;
import fr.basketcreamy.entities.pojo.User;

public interface IUserMetier {
	UserDto addUtilisateur(UserDto userDto) throws Exception;
	User seConnecter(String email, String password) throws Exception;
	User seDeconnecter(User user) throws Exception;
}
