package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Classes.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.addObject("product",product);
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("/ingresar")
	public ModelAndView validar(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main");
		}
		else {
			mav.setViewName("success");
		}
		return mav;
	}
}
