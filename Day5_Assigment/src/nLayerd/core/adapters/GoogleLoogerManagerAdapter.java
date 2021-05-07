package nLayerd.core.adapters;

import nLayerd.core.abstracts.GoogleLoggerService;
import nLayerd.googleLogger.GoogleLoggerManager;

public class GoogleLoogerManagerAdapter implements GoogleLoggerService{

	@Override
	public void sendMail(String email, String message) {
		// TODO Auto-generated method stub
		GoogleLoggerManager googleLoggerManager =new GoogleLoggerManager();
		googleLoggerManager.send(email, message);
		
	}


}
