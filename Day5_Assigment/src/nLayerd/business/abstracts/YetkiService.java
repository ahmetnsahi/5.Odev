package nLayerd.business.abstracts;

import nLayerd.entities.concretes.User;

public interface YetkiService {
	
	public void Kay�t(User user);
	public void Giri�(String email, String password);
	public boolean Zatenvar(String email);

}
