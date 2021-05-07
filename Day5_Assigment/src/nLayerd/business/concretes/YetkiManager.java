package nLayerd.business.concretes;

import nLayerd.business.abstracts.UserService;
import nLayerd.business.abstracts.YetkiService;
import nLayerd.core.utils.Regexs;
import nLayerd.entities.concretes.User;

public class YetkiManager implements YetkiService{

	UserService userService;
	
	
	public YetkiManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void Kay�t(User user) {
		// TODO Auto-generated method stub
		if(user != null && Zatenvar(user.getEmail()) && checkPassword(user.getPassword()) 
				&& Regexs.emailValidate(user.getEmail()) ) {
			
			userService.add(user);
		}
		else {
			System.out.println("Kay�t Baa�ar�s�z");
		}
		
	}

	@Override
	public void Giri�(String email, String password) {
		// TODO Auto-generated method stub
	User user = userService.getByMail(email);
		
		if(user != null && user.getPassword().equals(user.getPassword())) {
			System.out.println("Giri� Ba�ar�s�z");
		}
		else {
			System.out.println("Giri� Ba�ar�s�z");
		}
		
	}

	@Override
	public boolean Zatenvar(String email) {
		// TODO Auto-generated method stub
		if(userService.getByMail(email)!=null) {		
			System.out.println("Kullan�c� zaten var");
			return false;
		}
		return false;
	}
	
	public boolean checkPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmal�d�r.");
			return false;
		}
		return true;
	}
	
	

}
