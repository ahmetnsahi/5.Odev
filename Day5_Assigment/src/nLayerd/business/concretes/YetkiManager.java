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
	public void Kayýt(User user) {
		// TODO Auto-generated method stub
		if(user != null && Zatenvar(user.getEmail()) && checkPassword(user.getPassword()) 
				&& Regexs.emailValidate(user.getEmail()) ) {
			
			userService.add(user);
		}
		else {
			System.out.println("Kayýt Baaþarýsýz");
		}
		
	}

	@Override
	public void Giriþ(String email, String password) {
		// TODO Auto-generated method stub
	User user = userService.getByMail(email);
		
		if(user != null && user.getPassword().equals(user.getPassword())) {
			System.out.println("Giriþ Baþarýsýz");
		}
		else {
			System.out.println("Giriþ Baþarýsýz");
		}
		
	}

	@Override
	public boolean Zatenvar(String email) {
		// TODO Auto-generated method stub
		if(userService.getByMail(email)!=null) {		
			System.out.println("Kullanýcý zaten var");
			return false;
		}
		return false;
	}
	
	public boolean checkPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			return false;
		}
		return true;
	}
	
	

}
