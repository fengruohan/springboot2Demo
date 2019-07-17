package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.pojo.JsonData;

@Controller
public class FileController {
	
	
	
	@RequestMapping("/testapi")
	@ResponseBody
	public Object index() {
		int i=1/0;
		return "index";
	}
	
	
	@Value("${web.file.path}")
	private String filePath;
	
	
	
	//private static final String filePath="D:\\test\\";
	
	@RequestMapping("/upload")
	@ResponseBody
	public JsonData upload(@RequestParam("img") MultipartFile file,HttpServletRequest request) {
		JsonData jsonData = new JsonData();
		String filename = file.getOriginalFilename();
		
		System.out.println("文件名:"+filename);
		
		String suffixname = filename.substring(filename.lastIndexOf("."));
		System.out.println("文件后缀名:"+suffixname);
		
		System.out.println("文件路径:"+filePath);
		
		
		//文件上传后的路径
		filename = UUID.randomUUID()+suffixname;
		File dest = new File(filePath+filename);
		
		System.out.println("路径:"+dest);

		try {
			file.transferTo(dest);
			jsonData.setCode(1);
			jsonData.setMsg(filename);
			return jsonData;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonData;
		
	}
	
	

}
