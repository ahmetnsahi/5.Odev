package nLayerd.business.abstracts;

import nLayerd.entities.concretes.User;

public interface YetkiService {
	
	public void Kayýt(User user);
	public void Giriþ(String email, String password);
	public boolean Zatenvar(String email);

}
