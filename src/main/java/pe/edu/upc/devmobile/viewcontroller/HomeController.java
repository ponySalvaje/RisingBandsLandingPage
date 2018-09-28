package pe.edu.upc.devmobile.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
	
	@GetMapping(value = "")
	public String listar(Model model) {
		
		return "home";
	}
	
	
}
