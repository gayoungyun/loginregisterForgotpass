package loginregister.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import login.service.LoginService;
import login.service.LoginServiceImpl;


public class controller implements Initializable{
	@FXML public TextField fxId;
	@FXML public TextField fxPwd;
	
	Parent root;
	LoginService ls;
	
	private TextField fxName;
	
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();
		System.out.println("초기화 메소드");
		
		
	}
	public void loginFunc() {
		ls.loginFunc(fxName, fxPwd);
		System.out.println("확인 버튼 클릭");
	}
	
	public void createFunc() {
		System.out.println("회원가입 클릭");
		ls.createFunc(root);
	}

}
