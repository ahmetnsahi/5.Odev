package nLayerd;

import java.util.Scanner;

import nLayerd.business.concretes.UserManager;
import nLayerd.business.concretes.YetkiManager;
import nLayerd.dataAccess.concretes.DbSimulation;
import nLayerd.dataAccess.concretes.HibernateUserDao;
import nLayerd.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    UserManager userManager = new UserManager(new HibernateUserDao(new DbSimulation()),null);
     YetkiManager manager= new YetkiManager(userManager);
		
		System.out.println("5.Gün Ödev");
		
		int userInput = 1; //while girmesi için
		
		while (userInput != 0) {
			
			System.out.println("1 - Giriş Yap");
			System.out.println("2 - Kayıt Ol");
			System.out.println("0 - Çıkış Yap");
			
			
			userInput = scanner.nextInt();
			
			System.out.println("***********************************");
			
			
			if (userInput == 1) {
				System.out.println("Giriş Ekranı");
				
				System.out.println("E - Mail : ");
				String mail = scanner.next();
				String password = scanner.next();
				manager.Giriş(mail, password);
				
					
			}
			else if(userInput == 2) {
				System.out.println("Kayıt  Ekranı");
				System.out.println("İsim : ");
				String name = scanner.next();
				
				System.out.println("Soyisim : ");
				String lastName = scanner.next();
				
				System.out.println("Mail : ");
				String email = scanner.next();
				
				System.out.println("Şifre : ");
				String password = scanner.next();
				
				User user = new User(1, name, lastName, email, password); 
				
				manager.Kayıt(user);
			
				
			}
			else if(userInput == 0) {
				System.exit(0);
			}
		}	
	}
		

	

}
