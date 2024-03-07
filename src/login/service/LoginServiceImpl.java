package login.service;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import login.dao.LoginDAO;
import login.dto.LoginDTO;

public class LoginServiceImpl implements LoginService{
	public void loginFunc(TextField fxName, TextField fxPwd) {
		System.out.println("---서비스 로그인 확인 ---");
		System.out.println("id : "+fxName.getText());
		System.out.println("pwd : "+fxPwd.getText());
		LoginDTO dto = LoginDAO.db.get(fxName.getText());
		System.out.println("dto : "+dto);
		String msg = null;
		
		Alert alert = new Alert(AlertType.INFORMATION);
		
		if(dto != null) {
			if(dto.getPwd().equals(fxPwd.getText())){
				msg = dto.getName()+"님 인증성공";
			}else {
				msg = "비밀번호 틀림!";
			}
		}else {
			msg= "존재하지 않는 아이디 입니다";
		}
		alert.setContentText(msg);
		alert.show();
		System.out.println(msg);
	}
	/*
	public void registerFunc(Parent root) {
		System.out.println("서비스 쪽 회원가입 실행");
		MemberMain member = new MemberMain();
		member.viewFx(root);
		
	}
*/

	@Override
	public void createFunc(Parent root) {
		
	}

}
