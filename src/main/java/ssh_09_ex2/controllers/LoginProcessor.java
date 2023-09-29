package ssh_09_ex2.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;
import space.jbpark.utility.MyUtil;
import ssh_09_ex2.services.LoginService;

@Component
@RequestScope
@Data
public class LoginProcessor {
	
	private String username;
	private String password;
	
	private final LoginService loginService;
	
	public LoginProcessor(LoginService loginService) {
		super();
		this.loginService = loginService;
		MyUtil.getPrintStream().println("로그인 처리기 생성");
	}
	
	public boolean validCredentials() {				
		if ("natalie".equals(username) &&
				"1234".equals(password)) {
			loginService.setUsername(username);
			return true;
		} else {
			loginService.setUsername(null);
			return false;
		}
	}
	
}
