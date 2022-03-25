package fr.basketcreamy.model.connection;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class MyDataSource {

	private static MyDataSource instance;
	private EntityManager em;
	
	private MyDataSource() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySqlPersistence");
		this.em = emf.createEntityManager();
	}

	public static MyDataSource getInstance() {
		if (instance == null) {
			instance = new MyDataSource();
		}
		return instance;
	}
	
	public EntityManager getEntityManager() throws Exception {

		return this.em;
	}
}
