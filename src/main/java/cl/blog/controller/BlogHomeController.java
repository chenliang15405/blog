package cl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页的Controller
 * @author 8050
 *
 */
@Controller
@RequestMapping("home")
public class BlogHomeController {

	
	@RequestMapping("index")
	public String goHome() {
		return "home";
	}
	
	
}
