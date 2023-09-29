package ssh_09_ex2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Service
@SessionScope
@Data
public class LoginService {
	private String username;

}
