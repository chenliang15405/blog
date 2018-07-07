package cl.blog.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


/**
 * 文件上传类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/file")
public class FileController{

	
	
	/**
	 * 
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public String  uploadFile(MultipartHttpServletRequest multipartRequest,HttpServletRequest request) throws Exception{
		// ͨ��MultipartHttpServletRequest������MultipartFile
			MultipartFile multipartFile = multipartRequest.getFile("uploadFile");
			// ����ļ�������
			String originalName = multipartFile.getOriginalFilename();
			// ����ļ��ϴ��ľ���·��
			String path = request.getSession().getServletContext().getRealPath("upload");
			// ��ʼ��ô�ʱ�ļ��ĺ�׺
			String suffix = originalName.substring(originalName.lastIndexOf("."));
			// ��ʼ�����ļ���
			String newFileName = System.currentTimeMillis() + suffix;
			// ���file����
			File newFile = new File(path + File.separator + newFileName);
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
			// �ϴ�
			OutputStream output = new FileOutputStream(newFile);
			InputStream input = multipartFile.getInputStream();
			IOUtils.copy(input, output);
			
			input.close();
			output.close();
			return newFileName;
	}
	
	
}
