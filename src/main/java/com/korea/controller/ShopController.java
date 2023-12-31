package com.korea.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.k2.shop.MemberVO;
import com.korea.k2.shop.ShopService;

@Controller
public class ShopController {

	ShopController(){
		System.out.println("==============HIHIHI");
	}
	
	@Autowired
	private ShopService service;
	
	@RequestMapping("/selectAll.do")
	String selectAll(Model model, MemberVO vo) {
		System.out.println("========-===selectALLvo확인"+service.selectAll(vo));
		model.addAttribute("li",service.selectAll(vo));
		return "/shop/shop_selectAll.jsp";
	}
	
	@RequestMapping("/insert.do")
	String insert(MemberVO vo) {
		System.out.println("======insertvo확인"+ vo );
		String password = BCrypt.hashpw(vo.getPassword(), BCrypt.gensalt())  ; 
		vo.setPassword(password);	
		service.insert(vo);
		return "/selectAll.do";
	}
	@RequestMapping("/selectform.do")
	String custno(Model model) {
		model.addAttribute("custno",service.custno());
		return "/shop/shop_form.jsp";
	}
	
	@RequestMapping("/selectOne.do")
	String selectOne(HttpSession session, MemberVO vo) {
		session.setAttribute("m",service.selectOne(vo));
		return "/shop/shop_selectOne.jsp";
	}
	
	@RequestMapping("/update.do")
	String update(MemberVO vo) {
		service.update(vo);
		return "/selectAll.do";
	}
	
	   @RequestMapping("/IdCk.do")
	   void IdCk(HttpServletResponse response ,MemberVO vo ) throws Exception   {
	    
		    PrintWriter out=response.getWriter();
		    String str = service.idCk(vo);
		    System.out.println("===> str:" + str);
		    
		    if (str==null) {
		      if (vo.getId()!="") {	
		        out.print("T");
		      }
		    }else {
		      out.print("F");	
		    }
	   
	   }
		
	   @RequestMapping("/ShopMoney.do")
	   String ShopMoney(Model model) {
	     model.addAttribute("li", service.ShopMoney())  ; 
	   return "/shop/shop_ShopMoney.jsp";	   
	   }
	   
}
