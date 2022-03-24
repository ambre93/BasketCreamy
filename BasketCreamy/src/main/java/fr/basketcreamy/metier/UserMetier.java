package fr.basketcreamy.metier;

import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import fr.basketcreamy.cryptage.algo.AlgorithmeCryptage;
import fr.basketcreamy.entities.dao.IUserDao;
import fr.basketcreamy.entities.dao.UserDao;
import fr.basketcreamy.entities.dto.UserDto;
import fr.basketcreamy.entities.pojo.User;
import fr.basketcreamy.enums.EnumCryptage;

public class UserMetier implements IUserMetier {

	private IParams params = new Params();
		
	@Override
	public UserDto addUtilisateur(UserDto userDto) throws Exception {
		
		// on crypte le mot de passe
		// on convertit la date du String vers java.util.Date
		User user = new User();
		user.setNom(user.getNom());
		user.setPrenom(userDto.getPrenom());
		Date dateNaissance = new Date(userDto.getDateNaissance());
		user.setDateNaissance(dateNaissance);
		user.setEmail(userDto.getEmail());
		user.setTelephone(userDto.getTelephone());
		
		byte[] cleCryptage = params.getCleCryptagePwd();
		SecretKey key = new SecretKeySpec(cleCryptage, 0, cleCryptage.length, EnumCryptage.AES.getAlgorithm());
		byte[] passwordCrypte = AlgorithmeCryptage.encrypt(userDto.getPassword().toString(), key, EnumCryptage.AES.getAlgorithm());
		user.setPassword(passwordCrypte);
		
		IUserDao userDao = new UserDao();
		userDao.addUtilisateur(user);
		
		userDto.setId(String.valueOf(user.getId()));
		
		return userDto;
	}

	@Override
	public User seConnecter(String email, String password) throws Exception {
		User user = User.getUserByEmail(email);
		if (user != null) {
			//TODO Vérifier si IsActif est à true
			byte[] cleCryptage = params.getCleCryptagePwd();
			Key key = new SecretKeySpec(cleCryptage, EnumCryptage.AES.getAlgorithm());
			String passwordDataBase = AlgorithmeCryptage.decrypt(user.getPassword(), key, EnumCryptage.AES.getAlgorithm());
			if (passwordDataBase.equals(password)) {
				//TODO Mettre IsActif à true
				return user;
			}
		}
		return null;
	}

	@Override
	public User seDeconnecter(User user) throws Exception {
		// TODO Mettre IsActif à false
		return null;
	}

}
