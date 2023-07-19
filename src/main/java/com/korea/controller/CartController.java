package com.korea.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.k2.cart.CartService;
import com.korea.k2.cart.CartVO;
import com.korea.k2.cart.CartorderVO;
import com.korea.k2.cart.CartordermoneyVO;

@Controller
public class CartController {
	
	@Autowired
	private CartService service;
	
	
	
	@RequestMapping("/cartinsert.do")
	String cartinsert(CartVO vo) {
		service.insert(vo);
		return "/productselectAll.do";
	}
	
	@RequestMapping("/cartlist.do")
	String cartlist(Model model,CartVO vo) {
		model.addAttribute("li", service.selectAll(vo));
		return "/cart/cartlist.jsp";
	}
	
	@RequestMapping("/cartdelete.do")
	String cartdelete(CartVO vo) {
		service.delete(vo);
		return "/cartlist.do";
	}
	
	@RequestMapping("/cartdeleteAll.do")
	String cartdeleteAll(CartVO vo) {
		service.deleteAll(vo);
		return "/cartlist.do";
	}
	
	@RequestMapping("/cartupdate.do")
	String cartupdate(@RequestParam String[] cartId, @RequestParam String[] custNo, @RequestParam String[] productId, @RequestParam String[] amount) {
		
		for (int i=0 ; i < cartId.length ; i++) {
			CartVO vo = new CartVO();
			
			vo.setCartId(Integer.parseInt(cartId[i]));
			vo.setAmount(Integer.parseInt(amount[i]));
			service.update(vo);
		}
		
		return "redirect:/cartlist.do";
	}
	
	
	@RequestMapping("/cartorder.do")
	String cartorder (@RequestParam String[] cartId, @RequestParam String[] productId, @RequestParam String[] amount,@RequestParam String[] productName, CartordermoneyVO mvo) {
				
		service.insertordermoney(mvo);
		int orderG = service.selectidx(mvo);
		
		System.out.println("MVO확인찐"+orderG);
		CartorderVO ovo = null;
		for (int i=0 ; i < cartId.length ; i++) {
			ovo = new CartorderVO();
			ovo.setCustNo(mvo.getCustNo());
			ovo.setCartId(Integer.parseInt(cartId[i]));
			ovo.setProductId(Integer.parseInt(productId[i]));
			ovo.setProductName(productName[i]);
			ovo.setAmount(Integer.parseInt(amount[i]));
			ovo.setOrderG(orderG);
			service.insertorder(ovo);
		}
		
		System.out.println("==========멀까요"+mvo.getCustNo());
		return "selectAllorder.do";
	}
	
	   @RequestMapping("/selectAllorder.do")
		String selectAllorder(Model model, CartordermoneyVO vo) {
		   model.addAttribute("li", service.selectAllorder(vo));
		   System.out.println("serviceallorderVO확인"+service.selectAllorder(vo));
		   return "/cart/cartorderlist.jsp";
		}
	
	
}
