package ssh_09_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import ssh_09_ex2.services.LoginService;

@Controller
@AllArgsConstructor
public class MainController {
	private LoginService loginService;

	@GetMapping("/main")
	public String mainPage(Model model,
			@RequestParam(required = false) String logout,
			RedirectAttributes reAttrs) {
		String username = loginService.getUsername();
		
		if (username == null) {
			reAttrs.addFlashAttribute("message", "/main 방문은 로그인이 필요합니다");
			return "redirect:/";
		} else {
			model.addAttribute("username", username);
			return "main.html";
		}
	}
}
