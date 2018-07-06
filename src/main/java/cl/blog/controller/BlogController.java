package cl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.blog.entity.Blog;
import cl.blog.service.BlogService;

/**
 * 
 * @author 8050
 *
 */
@Controller
@RequestMapping("blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	//内容展示
	@RequestMapping(value="/content/{Id}",method=RequestMethod.GET)
	public String getContent(@PathVariable Integer id) {
		Blog blog = blogService.findBlogById(id);
		
		return "";
	}
	
	//编辑页面展示
	@RequestMapping(value="/editor")
	public String getContent(Model model) {
		
		return "blogEditor";
	}
	
	//保存blog
	@RequestMapping(value="addBlog",method=RequestMethod.POST)
	public String addBlog(Blog blog,Model model) {
		boolean b = blogService.saveBlog(blog);
		if(b) {
			return "";
		}
		return "";
	}
	
	
	
}
