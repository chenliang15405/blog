package cl.blog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.blog.dao.BlogMapper;
import cl.blog.entity.Blog;
import cl.blog.entity.BlogType;
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
		blog.setReleaseDate(new Date());
		try {
			blogMapper.save(blog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<BlogType> findBlogType() {
		List<BlogType> list = blogMapper.findBlogType();
		return list;
	}

	@Override
	public List<Blog> findAll() {
		return blogMapper.findAll();
	}	
	
	

}
