package nLayerd.dataAccess.abstracts;

import java.util.List;

import nLayerd.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByMail(String mail);
	List<User> getAll();
	

}
