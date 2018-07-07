package cl.blog.service;

import java.util.List;

import cl.blog.entity.Blog;
import cl.blog.entity.BlogType;

public interface BlogService {

	Blog findBlogById(Integer id);

	boolean saveBlog(Blog blog);

	List<BlogType> findBlogType();

	List<Blog> findAll();

	
	
	
}
