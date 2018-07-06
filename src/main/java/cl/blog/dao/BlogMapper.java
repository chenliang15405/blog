package cl.blog.dao;

import cl.blog.entity.Blog;

public interface BlogMapper {

	Blog findBlogById(Integer id);

	void save(Blog blog);

	
	
	
}
