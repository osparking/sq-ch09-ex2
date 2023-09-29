package ssh_09_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("loginResult", null);
		return "login.html";
	}
	
	@PostMapping("/")
	public String loginProcess(
			@RequestParam String username, 
			@RequestParam String password, 
			Model model) {
		if ("natalie".equals(username) &&
				"1234".equals(password)) {
			String msg = username + "님";
			model.addAttribute("loginResult", msg);
			return "main.html";
		} else {
			model.addAttribute("loginResult", "로그인에 실패했습니다");
			return "login.html";
		}
	}
	
}
