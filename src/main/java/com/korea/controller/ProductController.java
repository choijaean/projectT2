package com.korea.controller;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.korea.k2.product.productService;
import com.korea.k2.product.productVO;

@Controller
public class ProductController {

	
	@Autowired
	private productService service;
		
	String path ="";
	String timeStr ="";
	
	@Autowired // 서블릿 주입하기
	private ServletContext servletContext;
	
	// @PostConstruct 어노테이션을 설정해놓은 
	// init 메소드는 WAS가 띄워질 때 실행된다. 
	@PostConstruct 
	public void init() {
		path = servletContext.getRealPath("/product/files/");
		System.out.println("path:" + path);
	}

	@RequestMapping("/productinsert.do")
		String productinsert(productVO vo) throws Exception {
		long time = System.currentTimeMillis();
		SimpleDateFormat daytime =new SimpleDateFormat("HHmmss");
		timeStr=daytime.format(time);
    	
    	System.out.println("path:"+path);
    	
       	String fileName ="";
		MultipartFile updateFile =vo.getProductImg();
		fileName=updateFile.getOriginalFilename();
		File f=new File(path+fileName);
		if( !updateFile.isEmpty()) {
			if (f.exists()) {
			  String onlyFileName =fileName.substring(0,fileName.lastIndexOf(".")); 
			  String extension =fileName.substring(fileName.lastIndexOf(".")); 
			  fileName=onlyFileName+"_"+timeStr+extension;
			}
			updateFile.transferTo(new File(path+fileName));		  
		} else {
			 fileName= "space.png"; // 첨부파일이 없어면 ...
		}	
		vo.setProductImgStr(fileName);
		System.out.println("productinsertvo확인"+vo);
			service.insert(vo);
			return "/index.jsp";
		}
	
	   @RequestMapping("/productselectAll.do")
			String productselectAll(Model model, productVO vo) {
		   		model.addAttribute("li", service.selectAll(vo));
		   		System.out.println("productselectAllVO확인"+service.selectAll(vo));
				return "/product/productAll.jsp";
			}
	   
	   @RequestMapping("/productselectOne.do")
			String productselectOne(Model model, productVO vo) {
		   		model.addAttribute("p", service.selectOne(vo));
				return "/product/productEdit.jsp";
			}
	   
	   @RequestMapping("/productdelete.do")
			String productdelete(productVO vo) {
		   		service.delete(vo);
		   		File delF=new File(path + vo.getProductImgStr() );
				
				if (!vo.getProductImgStr().equals("space.png")) {
					delF.delete(); 
				}
				return "redirect:/productselectAll.do";
			}
}
