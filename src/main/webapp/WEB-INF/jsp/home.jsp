<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/static/css/bootstrap.min.css">
		
		<script type="text/javascript">
				
				function activeEle(id){
					$("#"+id).addClass("active");
				}
				function resetEle(id){
					$("#"+id).attr("class","");
				}
				
				function content(blogId){
					location.href="${pageContext.request.contextPath}/blog/content/"+blogId;
				}
				
				
				
		
		</script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<img alt="" src="<%=request.getContextPath() %>/static/img/2.gif">
				</div>
			</div>
			<div class="row" ">
				<nav class="navbar navbar-default" role="navigation">
				    <div class="container-fluid" >
					    <div class="navbar-header">
					        <a class="navbar-brand" href="#">个人主页</a>
					    </div>
					    <div>
					        <ul class="nav navbar-nav">
					            <li id="a" onmouseover="activeEle('a')" onmouseout="resetEle('a')"><a href="#">个人日记</a></li>
					            <li id="b" onmouseover="activeEle('b')" onmouseout="resetEle('b')"><a href="#">相册</a></li>
					            <li id="c" onmouseover="activeEle('c')" onmouseout="resetEle('c')"><a href="#">留言板</a></li>
					        </ul>
					        <ul class="nav navbar-nav navbar-right" style="margin: 0px;padding-top:10px;">
								<li >
									 <div class="form-group">
							            <input  type="text" class="form-control" placeholder="Search">
							        </div>
								</li>
								<li>
									 <button  type="submit" class="btn btn-default">提交</button>
								</li>
							</ul>
					    </div>
				    </div>
				</nav>
				</div>
				
				<div onclick="content('11')">
					<div style="background-color:#FFFFCC;width:800px;height:200px;">
						<div style="float:left;">
					   		<img alt="" width="300px" height="200px" align="middle" src="<%=request.getContextPath() %>/static/img/title_1.jpg">
						</div>
						<div  style="float:left;padding-top:20px;padding-left:15px;">
				        	<ul>
				        		<li  style="list-style-type:none">标题</li>
				        		<li style="list-style-type:none">时间，分类</li>
				        		<li style="list-style-type:none">描述</li>
				        	</ul>
						</div>
				     </div>
				</div>
			
			
			</div>
		
	</body>
</html>