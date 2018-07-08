package cl.blog.utils;

public class BlogResult {

	public static  Integer status;
	
	public static  String msg;

	public BlogResult() {
	}
	
	public BlogResult(Integer status) {
		this.status = status;
	}
	public BlogResult(String msg) {
		this.msg = msg;
		if(status==0||status==null) {
			status = 200;
		}
	}
	
	public BlogResult(Integer status,String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	private static BlogResult blogResult;
	
	public static BlogResult build(Integer stataus,String msg) {
			if(blogResult==null) {
				blogResult = new BlogResult(stataus, msg);
			}
			return blogResult;
	}

	public static Integer getStatus() {
		return status;
	}

	public static void setStatus(Integer status) {
		BlogResult.status = status;
	}

	public static String getMsg() {
		return msg;
	}

	public static void setMsg(String msg) {
		BlogResult.msg = msg;
	}
	
	
	
	
	
}
