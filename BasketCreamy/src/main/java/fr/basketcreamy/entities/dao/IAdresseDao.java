package fr.basketcreamy.entities.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.Adresse;

public interface IAdresseDao {

	Adresse getAdressById (Integer id) throws Exception;
	Adresse getAdresByEmail (String Email) throws Exception;
	List<Adresse> getAll() throws Exception;
	Adresse addAdresse  (Adresse adresse) throws Exception;
	Adresse saveAdresse ( Adresse adresse) throws Exception;
	Adresse insertAdresse (Adresse adresse) throws Exception;
	Adresse updateAdresse (Adresse adresse) throws Exception;
	Adresse deleteAdresse (Adresse adresse) throws Exception;
	

	
}



//T get (Integer id) throws Exception;
//int save (T t) throws Exception;
//int insert (T t) throws Exception;
//int update (T t) throws Exception;
//int delete (T t) throws Exception;