package ssh_09_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("loginResult", null);
		return "login.html";
	}
	
}
