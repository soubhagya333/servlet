package com.xworkz.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

public class UploadFileServlet extends HttpServlet {

	private static final String UPLOAD_DIRECTORY = "C:/uploads";
	public UploadFileServlet() {
		System.out.println("created UploadFileServlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		
		Part filePart = req.getPart("file"); // Retrieves <input type="file" name="file">
		InputStream filecontent = filePart.getInputStream();
		System.out.println(filecontent);
		if(ServletFileUpload.isMultipartContent(req)){
            try {
                
               //File uploaded successfully
               req.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               req.setAttribute("message", "File Upload Failed due to " + ex);
            }          
          
        }else{
            req.setAttribute("message","Sorry this Servlet only handles file upload request");
        }
     
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
      
    }
		
	}
	

