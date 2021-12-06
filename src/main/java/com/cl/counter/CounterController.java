package com.cl.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			session.setAttribute("count", 0);
		}
		else {
			count = count + 1;
			session.setAttribute("count", count);
		}
		Integer countUpdated = (Integer) session.getAttribute("count");
		model.addAttribute("count", countUpdated);
		return "index.jsp";
	}
	
	@RequestMapping("/counter2")
	public String counter2(HttpSession session, Model model) {
		Integer count2 = (Integer) session.getAttribute("count2");
		if (count2 == null) {
			session.setAttribute("count2", 0);
		}
		else {
			count2 = count2 + 2;
			session.setAttribute("count2", count2);
		}
		Integer countUpdated = (Integer) session.getAttribute("count2");
		model.addAttribute("count2", countUpdated);
		return "counter.jsp";
	}
}
