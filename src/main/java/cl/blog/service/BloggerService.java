package cl.blog.service;

import cl.blog.entity.Blogger;
import cl.blog.utils.BlogResult;

public interface BloggerService {

	BlogResult login(Blogger blogger);

}
