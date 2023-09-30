package ssh_09_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import space.jbpark.utility.MyUtil;

@Controller
public class LoginController {
	private LoginProcessor loginProcessor;
	
	public LoginController(LoginProcessor loginProcessor) {
		super();
		this.loginProcessor = loginProcessor;
		MyUtil.getPrintStream().println("로그인 제어기 생성");
	}

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
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		if (loginProcessor.validCredentials()) {
			String msg = username + "님";
			model.addAttribute("loginResult", msg);
			
			return "redirect:/main";
		} else {
			model.addAttribute("loginResult", "로그인에 실패했습니다");
			return "redirect:/";
		}
	}
	
}
