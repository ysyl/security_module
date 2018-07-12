package security.demo.controller;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestDAOController {
	
	private UserDetailsService userds;

	@GetMapping("/dao")
	public String testDAO() {
		return userds.loadUserByUsername("verrickt").getUsername();
	}
}
