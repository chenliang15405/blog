package cl.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.blog.dao.BlogMapper;
import cl.blog.entity.Blog;
import cl.blog.service.BlogService;

@Transactional
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	public Blog findBlogById(Integer id) {
		return blogMapper.findBlogById(id);
	}

	@Override
	public boolean saveBlog(Blog blog) {
		try {
			blogMapper.save(blog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}	
	
	

}
