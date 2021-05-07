package nLayerd.business.abstracts;

import java.util.List;

import nLayerd.entities.concretes.User;

public interface UserService {
	public void add(User user);
	User getByMail(String email);
	List<User> getAll();

}
