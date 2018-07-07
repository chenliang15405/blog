package cl.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.blog.entity.Blog;
import cl.blog.entity.BlogType;
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
		List<BlogType> list = blogService.findBlogType();
		model.addAttribute("blogTypeList", list);
		return "blogEditor";
	}
	
	//保存blog
	@RequestMapping(value="addBlog",method=RequestMethod.POST)
	public String addBlog(Blog blog,Model model) {
		boolean b = blogService.saveBlog(blog);
		if(b) {
			return "blog/home";
		}
		return "fail";
	}
	
	
	@RequestMapping("home")
	public String blogHome(Model model) {
		List<Blog> blogList = blogService.findAll();
		String typeName = blogList.get(0).getBlogType().getTypeName();
		model.addAttribute("blogList", blogList);
		return "home/index";
	}
	
	
}
