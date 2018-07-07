package cl.blog.dao;

import java.util.List;

import cl.blog.entity.Blog;
import cl.blog.entity.BlogType;

public interface BlogMapper {

	Blog findBlogById(Integer id);

	void save(Blog blog);

	List<BlogType> findBlogType();

	List<Blog> findAll();

	
	
	
}
