package com.hurtowniavien.controller.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "itemControllerOfWeb")
public class HomeController {

	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public ModelAndView detailPage() {
		ModelAndView mav = new ModelAndView("item/home");
		return mav;
	}
}
