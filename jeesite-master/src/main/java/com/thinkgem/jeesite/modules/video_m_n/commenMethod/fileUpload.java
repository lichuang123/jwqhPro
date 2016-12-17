package com.thinkgem.jeesite.modules.video_m_n.commenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class fileUpload {

	static Log log = LogFactory.getLog(fileUpload.class);
	/**
	 * @param address 下载文件完整路径名，如：E:/aa/bb/abc.jpg
	 * @param response HttpServletResponse
	 * @param fileName 原文件名
	 * 
	 * */
	public static void fileDownload(String address,HttpServletResponse response,String fileName,HttpServletRequest request) throws IOException{
		
		log.debug("文件下载路径.............."+address+"-----原文件名-------"+fileName);
		InputStream is = new FileInputStream(new File(address));
		OutputStream os = response.getOutputStream();
		String userAgent = request.getHeader("User-Agent");
		byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes()
		: fileName.getBytes("UTF-8");
		fileName = new String(bytes, "ISO-8859-1"); 
		response.setHeader("Content-disposition",
		String.format("attachment; filename=\"%s\"", fileName));
		byte[] data = new byte[1024];
		int len;
		while((len=is.read(data))!=-1){
			os.write(data, 0, len);
		}
		is.close();
		os.close();
	}
}
