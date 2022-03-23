package fr.basketcreamy.metier;

import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import fr.basketcreamy.cryptage.algo.AlgorithmeCryptage;
import fr.basketcreamy.entities.dao.IUtilisateurDao;
import fr.basketcreamy.entities.dao.UtilisateurDao;
import fr.basketcreamy.entities.dto.UtilisateurDto;
import fr.basketcreamy.entities.pojo.Utilisateur;
import fr.basketcreamy.enums.EnumCryptage;

public class UtilisateurMetier implements IUtilisateurMetier {

	private IParams params = new Params();
		
	@Override
	public UtilisateurDto addUtilisateur(UtilisateurDto utilisateurDto) throws Exception {
		
		// on crypte le mot de passe
		// on convertit la date du String vers java.util.Date
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(utilisateur.getNom());
		utilisateur.setPrenom(utilisateurDto.getPrenom());
		Date dateNaissance = new Date(utilisateurDto.getDateNaissance());
		utilisateur.setDateNaissance(dateNaissance);
		utilisateur.setEmail(utilisateurDto.getEmail());
		utilisateur.setTelephone(utilisateurDto.getTelephone());
		
		byte[] cleCryptage = params.getCleCryptagePwd();
		SecretKey key = new SecretKeySpec(cleCryptage, 0, cleCryptage.length, EnumCryptage.AES.getAlgorithm());
		byte[] passwordCrypte = AlgorithmeCryptage.encrypt(utilisateurDto.getPassword().toString(), key, EnumCryptage.AES.getAlgorithm());
		utilisateur.setPassword(passwordCrypte);
		
		IUtilisateurDao utilisateurDao = new UtilisateurDao();
		utilisateurDao.addUtilisateur(utilisateur);
		
		utilisateurDto.setId(String.valueOf(utilisateur.getId()));
		
		return utilisateurDto;
	}

	@Override
	public Utilisateur seConnecter(String email, String password) throws Exception {
		Utilisateur user = Utilisateur.getUserByEmail(email);
		if (user != null) {
			byte[] cleCryptage = params.getCleCryptagePwd();
			Key key = new SecretKeySpec(cleCryptage, EnumCryptage.AES.getAlgorithm());
			String passwordDataBase = AlgorithmeCryptage.decrypt(user.getPassword(), key, EnumCryptage.AES.getAlgorithm());
			if (passwordDataBase.equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public Utilisateur seDeconnecter(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
