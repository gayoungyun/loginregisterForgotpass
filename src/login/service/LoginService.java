package login.service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public interface LoginService {
	public void loginFunc(TextField fxName, TextField fxPWd);
	public void createFunc(Parent root);

}
