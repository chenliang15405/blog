package cl.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.blog.entity.Blog;
import cl.blog.service.BlogService;

/**
 * 首页的Controller
 * @author 8050
 *
 */
@Controller
@RequestMapping("home")
public class BlogHomeController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping("index")
	public String goHome(Model model) {
		List<Blog> blogList = blogService.findAll();
		model.addAttribute("blogList", blogList);
		return "home";
	}
	
	
}
