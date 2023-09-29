package ssh_09_ex2.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;
import space.jbpark.utility.MyUtil;

@Component
@RequestScope
@Data
public class LoginProcessor {
	
	private String username;
	private String password;
	
	public LoginProcessor() {
		super();
		MyUtil.getPrintStream().println("로그인 처리기 생성");
	}
	
	public boolean validCredentials() {				
		if ("natalie".equals(username) &&
				"1234".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
}
