package ssh_09_ex2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;
import space.jbpark.utility.MyUtil;

@Service
@SessionScope
@Data
public class LoginService {
	private String username;

	public LoginService() {
		super();
		MyUtil.getPrintStream().println("로그인 서비스 빈 생성됨");
	}
	
}
