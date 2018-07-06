package cl.blog.service;

import cl.blog.entity.Blog;

public interface BlogService {

	Blog findBlogById(Integer id);

	boolean saveBlog(Blog blog);

	
	
	
}
