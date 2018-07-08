package cl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.blog.entity.Blogger;
import cl.blog.service.BloggerService;
import cl.blog.utils.BlogResult;
/**
 * blogger的controller
 * @author Administrator
 *
 */
@Controller
public class BloggerController {
	
	@Autowired
	private BloggerService bloggerService;
	
	 @RequestMapping(value="login",method=RequestMethod.GET)
	 public String showLogin() {
		 return "login_form";
	 }
	 
	 @RequestMapping(value="login",method=RequestMethod.POST)
	 public String login(Blogger blogger) {
		 BlogResult blogResult = bloggerService.login(blogger);
		 return "redirect:/blog/editor";
	 }

}
