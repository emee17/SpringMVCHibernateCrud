package org.controller;

import java.util.List;

import org.pojo.Idiot;
import org.service.IdiotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController 
{
	@Autowired
	private IdiotService idiotService;
	
	@RequestMapping("/")
	public String home(Model model)
	{
 		model.addAttribute("idiot", new Idiot());
		return "index.jsp";
	}
	
	@PostMapping("register")
	public String register (@ModelAttribute("idiot") Idiot idiot)
	{
		
		idiotService.addIdiot(idiot);
		
		return "redirect:/listIdiots";
	}
	
	@RequestMapping("listIdiots")
	public ModelAndView listIdiots(ModelAndView mv)
	{
		List<Idiot> listidiots = idiotService.getAllIdiots();
		mv.addObject("listidiots",listidiots);
		mv.setViewName("AllIdiots.jsp");
		return mv;
	}
	
	@RequestMapping("/editByEmail/{email}")
	public ModelAndView findIdiotById(@PathVariable("email") String email)
	{
		System.out.println("In in Edit");
		ModelAndView mv = new ModelAndView();
		Idiot idiot = idiotService.getIdiotById(email);
		System.out.println("Edit Done");
		mv.addObject("idiot",idiot);
		mv.setViewName("/editByEmail.jsp");
		System.out.println("View Shown");
		return mv;
	}
	
	@RequestMapping("/updatIdiot")
	public void updateIdiot(@ModelAttribute("idiot") Idiot idiot)
	{
		idiotService.updateIdiot(idiot);
	}
	
	@RequestMapping("/deletetByEmail/{email}")
	public String  deletetByEmail(@PathVariable("email") String email)
	{
		System.out.println("In in delete");
		idiotService.deletetByEmail(email);
		System.out.println("Delete Done");
		return "redirect:/AllIdiots.jsp";
	}
	
	public void setIdiotservice(IdiotService idiotService) {
		this.idiotService = idiotService;
	}
}