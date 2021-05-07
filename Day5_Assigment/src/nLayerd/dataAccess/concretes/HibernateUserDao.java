package nLayerd.dataAccess.concretes;
import java.util.List;

import nLayerd.dataAccess.abstracts.UserDao;
import nLayerd.entities.concretes.User;



public class HibernateUserDao implements UserDao {
	
	DbSimulation dbSimulation;
	
	
	
	
	public HibernateUserDao(DbSimulation dbSimulation) {
		super();
		this.dbSimulation = dbSimulation;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		dbSimulation.getUsers().add(user);
		System.out.println("Hibernate ile Eklendi " + user.getName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByMail(String mail) {
		
		for (User user : dbSimulation.getUsers()) {
			if (user.getEmail().equals(mail)) {
				return user;
			}
		}
		System.out.println("Bu maille Kayýt olunmadý");
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}




}
