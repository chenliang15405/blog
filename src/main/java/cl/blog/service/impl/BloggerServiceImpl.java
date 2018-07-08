package cl.blog.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.blog.dao.BloggerMapper;
import cl.blog.entity.Blogger;
import cl.blog.service.BloggerService;
import cl.blog.utils.BlogResult;
@Transactional
@Service
public class BloggerServiceImpl implements BloggerService{

	@Autowired
	private BloggerMapper bloggerMapper;
	
	
	@Override
	public BlogResult login(Blogger blogger) {
		String password = bloggerMapper.getByUserName(blogger.getUsername());
		if(StringUtils.isNotBlank(password)) {
			if(blogger.getPassword().equals(password)) {
				return BlogResult.build(200, "登录成功");
			}
		}
		return BlogResult.build(500, "账号或者密码错误");
	}

	
	
}
