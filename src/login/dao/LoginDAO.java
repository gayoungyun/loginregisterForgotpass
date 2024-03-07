package login.dao;

import java.util.HashMap;
import java.util.Map;

import login.dto.LoginDTO;

public class LoginDAO {
	public static Map<String, LoginDTO>db;
	static {
		db = new HashMap<>();
		for(int i=0; i<3;i++) {
			String name = "aaa"+i;
			LoginDTO dto = new LoginDTO(name, "홍길동"+i);
			db.put(name, dto);
		}
	}

}
