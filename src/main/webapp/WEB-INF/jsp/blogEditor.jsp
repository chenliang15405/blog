<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/static/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/editor.md-master/css/editormd.css" />
		<script>
		     var testEditor;
		        $(function() {
		            testEditor = editormd("test-editormd", {
		                width   : "90%", 
		                height  : 400,
		                syncScrolling : "single",
		                saveHTMLToTextarea : true, //设置可保存为html 获取的时候testEditor.getHtml();就可以了
		                /*theme : "dark",*/  //设置主题，有默认
		                /*previewTheme : "dark",*/
		                /*editorTheme : "pastel-on-dark",*/
		                searchReplace : true,
		                emoji : true,
		                taskList : true,
		                tocm            : true,         // Using [TOCM]
		                tex : true,                   // 开启科学公式TeX语言支持，默认关闭
		                flowChart : true,             // 开启流程图支持，默认关闭
		                sequenceDiagram : true,       // 开启时序/序列图支持，默认关闭,
		                dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
		                imageUpload : true,
		                imageFormats : ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
		                imageUploadURL : "./php/upload.php",
		                path    : "${pageContext.request.contextPath}/editor.md-master/lib/"
		            });
		        });
		  </script>
		
	</head>
	<body>
		<div style="width:800px;height:800px;margin-left:200px;margin-top:100px;">
			<form role="form" action="<%=request.getContextPath() %>/blog/addBlog" method="post">
				  <div class="form-group" style="padding-left:50px;">
				  	<span>
					  
				      标题：	<input type="text" class="form-control" id="title" placeholder="请输入标题名称" width="50px;">
				    </span>
				  </div>
				  <div class="form-group" style="padding-left:50px;">
				    <label>摘要：</label>
				    <input type="text" class="form-control" id="summary" placeholder="请输入摘要"  width="100px;">
				  </div>
				   <div class="form-group" style="padding-left:50px;">
				    <label>关键词：</label>
				    <input type="text" class="form-control" id="keyword" placeholder="请输入关键词"  width="100px;">
				  </div>
				  <div class="form-group"  style="padding-left:50px;">
				    <label>图片</label>
				    <input type="file" id="img" name="img"/>
				  </div>
				  <div class="checkbox" style="padding-bottom:20px;">
				    <label>
				    	所属类别:
				    </label>
				      <c:forEach items="${blogType }" var="blogType">
				     	 <input type="checkbox" name="blogType" value="${blogType.typeName}">
				      </c:forEach>
				  </div>
				  <div style="width:1200px;height:700px;">
					<div id="test-editormd" style="margin-left:0px;">
					    <textarea name="blogContent" id="blogContent"></textarea>
					</div>	
					<div style="padding-left:500px;padding-top:20px">
					  <button type="submit" class="btn btn-default">提交</button>	
				 	 </div>
				  </div>
				  
			</form>
		</div>
	</body>
	<!-- 引入js放到body最下面 -->
	<script src="<%=request.getContextPath() %>/editor.md-master/editormd.js"></script>
</html>