package nLayerd.business.concretes;

import java.util.List;

import nLayerd.business.abstracts.UserService;
import nLayerd.core.abstracts.GoogleLoggerService;
import nLayerd.dataAccess.abstracts.UserDao;
import nLayerd.dataAccess.concretes.DbSimulation;
import nLayerd.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private DbSimulation dbSimulation;
	private GoogleLoggerService googleLoggerService;
	
	public UserManager(UserDao userDao, GoogleLoggerService googleLoggerService) {
		super();
		this.userDao = userDao;
		this.googleLoggerService = googleLoggerService;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if(user.getName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("Ýsim ve soyisim 2 karakterden fazla olmalýdýr");
			return;
		}
		this.userDao.add(user);
		this.googleLoggerService.sendMail(user.getEmail(), "Kullanýcý Eklendi");
	}

	@Override
	public User getByMail(String email) {
		
		return userDao.getByMail(email); 
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
