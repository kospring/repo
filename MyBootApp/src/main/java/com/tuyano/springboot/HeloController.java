package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HeloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		mav.setViewName("index");
		mav.addObject("msg","数字を入力してください");
		return mav;
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav){
		mav.addObject("msg","結果は、" + str + "です");
		mav.addObject("value",str);
		mav.setViewName("index");
		return mav;
	}
}
